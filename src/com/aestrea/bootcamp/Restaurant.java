package com.aestrea.bootcamp;

public class Restaurant {
    /**
     *
     * Prints the menu/submenu for our restaurant based on passed args
     *
     * @param args
     */
    public final static String[] menu = {"Seafood","Meat","Appetizers"};
    public final static String[] menuSeafood = {"Crab","Lobster","Shrimp"};
    public final static String[] menuMeat = {"Steak","Sinigang","Breaded Pork"};
    public final static String[] menuAppetizers = {"Chicaron Bulaklak","Calamares"};

    public void printMenu(String[] args) {
        if(args.length==0){
            printMainMenu(args);
        }else if(args[0].equals("Seafood")){
            printMenuSeafood(args);
        }else if(args[0].equals("Meat")){
            printMenuMeat(args);
        }else if(args[0].equals("Appetizers")){
            printMenuAppetizer(args);
        }else{
            System.out.print("Enter a valid argument");
        }
    }

    public void printMenuSeafood(String[] args){
            for (int i=0; i<menuSeafood.length; i++){
                System.out.println(menuSeafood[i]);
            }
    }

    public void printMenuMeat(String[] args){
            for (int i=0; i<menuMeat.length; i++){
                System.out.println(menuMeat[i]);
            }
    }

    public void printMenuAppetizer(String[] args){
            for (int i=0; i<menuAppetizers.length; i++){
                System.out.println(menuAppetizers[i]);
            }
    }

    public void printMainMenu(String[] args){
            for (int i=0; i<menu.length; i++){
                System.out.println(menu[i]);
            }
    }


}
