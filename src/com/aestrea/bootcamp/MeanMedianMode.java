package com.aestrea.bootcamp;


import java.util.*;

public class MeanMedianMode {
    /**
     * Prints the mean, median and mode for a list of string arguments that are numbers
     *
     * @param args
     */
    List<String> modeList = new ArrayList<String>();
    ArrayList<Integer> list = new ArrayList<Integer>();

    public void findMeanMedianMode(String args[]) {
        sortList(args);
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
        double length = list.size()+1;
        double middle= length/2;
        int middleNum = (int) middle;
        double median = (Double.parseDouble(list.get(middleNum).toString())+Double.parseDouble(list.get(middleNum-1).toString()))/2;
        if(length%2 == 0.0){
            System.out.print("Median: "+ middle+ " ");
        }else{
            System.out.print("Median: "+ median + " ");
        }
    }

    public void getMode(String[] args){
        int counter = 0;
        int maxCounter = 0;
        System.out.print("Mode: ");
            for(int i=1; i<list.size(); i++){
                if(list.get(i).equals(list.get(i-1))){
                    counter++;
                    if(counter >= maxCounter){
                        maxCounter = counter;
                        modeList.add(list.get(i).toString());
                    }
                }else{
                    counter=0;
                }
            }
            if (maxCounter==0){
                for(int i=0; i<args.length; i++){
                System.out.print(args[i]+" ");
                }
            }
            Set<String> uniqueMode = new HashSet<String>(modeList);
            Iterator iterate = uniqueMode.iterator();
            while(iterate.hasNext()){
            System.out.print(iterate.next()+" ");
            }
    }

    public void sortList(String[] args){
        for (int i=0; i<args.length;i++){
            list.add(Integer.parseInt(args[i]));
        }
        Collections.sort(list);
    }

}
