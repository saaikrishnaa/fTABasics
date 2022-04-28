package com.fta.handson.earlier.javaHandson.strings;

public class StringArrayHandson {

    public static void main(String[] args) {
       //way -1
        String []stringArray = {"Hi","How","Are","You","Doing"};


//        //To find the length of the array, use .length
        System.out.println(stringArray.length-1);
//
//        //To access a value at a particular index, access it through that index
        System.out.println(stringArray[2]);

        //Iterate through the array
//        for(String currentValue : stringArray){
//            System.out.println(currentValue);
//        }

        for(int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }

        System.out.println("======================");
        
        //way -2
        String[] sizedArray = new String[9];
        System.out.println(sizedArray.length);
        sizedArray[0] = "Hi";
        sizedArray[4] = "Are";
        sizedArray[8] = "Last Index Value";

        System.out.println(sizedArray[4]);

        sizedArray[4] = "Now with latest value";
        
        System.out.println(sizedArray[4]);

    }
}
