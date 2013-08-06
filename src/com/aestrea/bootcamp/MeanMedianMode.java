package com.aestrea.bootcamp;


import java.util.*;

public class MeanMedianMode {
    /**
     * Prints the mean, median and mode for a list of string arguments that are numbers
     *
     * @param args
     */
    List<String> modeList = new ArrayList<String>();


    public void findMeanMedianMode(String args[]) {
        getMean(args);
        getMedian(args);
        getMode(args);
    }

    public void getMean(String[] args){
        double mean;
        double sum=0;

        for(int i=0; i<args.length;i++){
            sum += Double.parseDouble(args[i]);
        }

        mean = sum/args.length;
        System.out.print("Mean: "+ mean + " ");
    }

    public void getMedian(String[] args){
        double length = args.length+1;
        double middle= length/2;
        int middleNum = (int) middle;
        double median = (Double.parseDouble(args[middleNum])+Double.parseDouble(args[middleNum-1]))/2;
        if(length%2 == 0.0){
            System.out.print("Median: "+ middle+ " ");
        }else{
            System.out.print("Median: "+ median + " ");
        }
    }

    public void getMode(String[] args){
        Arrays.sort(args);
        int counter = 0;
        int maxCounter = 0;

        System.out.print("Mode: ");
        for(int i=1; i<args.length; i++){
            if(args[i].equals(args[i-1])){
                counter++;
                if(counter >= maxCounter){
                    maxCounter = counter;
                    modeList.add(args[i]);
                }

            } else{
                counter=0;
            }
        }

        Set<String> uniqueMode = new HashSet<String>(modeList);
        Iterator iterate = uniqueMode.iterator();
        while(iterate.hasNext()){
        System.out.print(iterate.next()+" ");

        }

    }

}
