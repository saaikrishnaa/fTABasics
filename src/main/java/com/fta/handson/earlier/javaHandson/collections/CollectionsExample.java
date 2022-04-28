package com.fta.handson.earlier.javaHandson.collections;

import com.fta.handson.earlier.javaHandson.polymorphism.Employee;

import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {

        List<Integer> rollNumbersList = new ArrayList<>();

        rollNumbersList.add(1);
        rollNumbersList.add(0);
        rollNumbersList.add(3);
        rollNumbersList.add(234);
        rollNumbersList.add(34);
        rollNumbersList.add(3);
        rollNumbersList.add(0);

        //traditional for loop
        for(int i=0; i< rollNumbersList.size(); i++){
//            System.out.println(rollNumbersList.get(i));
        }

        //enhanced for loop - not work w.r.t Indexes
        for(Integer rollNumber : rollNumbersList){
//            System.out.println(rollNumber);
        }

        //===================================================================

        Employee employee = new Employee();
        Set<Integer> rolls = new HashSet<>(rollNumbersList);


        for(Integer rollnum : rolls){
//            System.out.println(rollnum);
        }

        //===================================================================

        Map<Integer, String> attendanceMap = new HashMap<>();

        Map<String, List<Integer>> stringIntegerListMap = new HashMap<>();
        Map<Double, List<Map<String, List<Employee>>>> anotherMap = new HashMap<>();

        attendanceMap.put(1, "Vishnu Priya");
        attendanceMap.put(2, "Padmaja");
        attendanceMap.put(3, "Lakshmi");
        attendanceMap.put(4, "Sai");
        attendanceMap.put(4, "Sai Good Programmer");

        for(Map.Entry<Integer, String> studentEntry : attendanceMap.entrySet()){
            System.out.println(studentEntry.getKey()+" "+studentEntry.getValue());
        }

        System.out.println(attendanceMap.get(0));

        //===================================================================




    }
}
