package com.fta.handson.java.runner;


import com.fta.handson.java.staticentity.StaticBlock;


public class StaticRunner {

    public static void main(String[] args) {

//        AffiliatedColleges siddharthaCollege = new AffiliatedColleges("Siddhartha College", 232351, true, "Acharya Nagarjuna University");
//        System.out.println(siddharthaCollege.toString());
//
//        AffiliatedColleges klceCollege = new AffiliatedColleges("K.L.C.E College", 874556, true, "Acharya Nagarjuna University");
//        System.out.println(klceCollege.toString());
//
//        AffiliatedColleges bapatlaEngineeringCollege = new AffiliatedColleges("Bapatla Engineering College", 123323, true, "Acharya Nagarjuna University");
//        System.out.println(bapatlaEngineeringCollege.toString());
//
//        AffiliatedColleges newCollege = new AffiliatedColleges("Recently Established College", 989898, false, "Acharya Nagarjuna University");
//        System.out.println(newCollege.toString());
//
//        AffiliatedColleges gokulCollege = new AffiliatedColleges("Gokul Engineering College", 52523, true, "Acharya Nagarjuna University");
//        System.out.println(gokulCollege.toString());
//
//        System.out.println("============================================================================");

//        AffiliatedCollegesStaticVariable siddharthaCollegeUsingStatic = new AffiliatedCollegesStaticVariable("Siddhartha College", 232351, true);
//          AffiliatedCollegesStaticVariable.universityName = "Acharya Nagarjuna University";
////        System.out.println(AffiliatedCollegesStaticVariable.universityName);
////        System.out.println(AffiliatedCollegesStaticVariable.isCampusPlacementsProvided);
////        AffiliatedCollegesStaticMethod.getCollegeDetails();
//
//        System.out.println(siddharthaCollegeUsingStatic.toString());
////
//        AffiliatedCollegesStaticVariable klceCollegeUsingStatic = new AffiliatedCollegesStaticVariable("K.L.C.E College", 874556, true);
//        System.out.println(klceCollegeUsingStatic.toString());
//
//        AffiliatedCollegesStaticVariable bapatlaEngineeringCollegeUsingStatic = new AffiliatedCollegesStaticVariable("Bapatla Engineering College", 123323, true);
//        System.out.println(bapatlaEngineeringCollegeUsingStatic.toString());
//
//        AffiliatedCollegesStaticVariable newCollegeUsingStatic = new AffiliatedCollegesStaticVariable("Recently Established College", 989898, false);
//        System.out.println(newCollegeUsingStatic.toString());
//
//        AffiliatedCollegesStaticVariable.universityName = "Other University";
//        AffiliatedCollegesStaticVariable willStaticVariableNameChangeReflect = new AffiliatedCollegesStaticVariable("Another Established College", 989898, false);
//        System.out.println(willStaticVariableNameChangeReflect.toString());
//
//        System.out.println("============================================================================");
//        AffiliatedCollegesStaticMethod affiliatedCollegesStaticMethod = new AffiliatedCollegesStaticMethod("My College Name", 12113, true);
//        System.out.println(affiliatedCollegesStaticMethod.toString());
//
//        AffiliatedCollegesStaticMethod.getCollegeDetails();

//
//        System.out.println("============================================================================");
//
        StaticBlock staticBlock = new StaticBlock();
        StaticBlock.staticMethod();
        staticBlock.businessMethod();

        System.out.println();

        StaticBlock anotherInstance = new StaticBlock();
        StaticBlock.staticMethod();
        anotherInstance.businessMethod();

        System.out.println();

        StaticBlock oneMoreInstance = new StaticBlock();
        StaticBlock.staticMethod();
        oneMoreInstance.businessMethod();

    }
}
