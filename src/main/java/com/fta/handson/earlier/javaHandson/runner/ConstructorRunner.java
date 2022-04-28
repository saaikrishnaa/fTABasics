package com.fta.handson.earlier.javaHandson.runner;

import com.fta.handson.earlier.javaHandson.pojo.College;

public class ConstructorRunner {

    public static void main(String[] args) {

//        College jntu = new College();
//        String defaultValues = jntu.toString();
//        System.out.println(defaultValues);
//
//        College cbit = new College();
//        cbit.setId(23332);
//        cbit.setName("Chaitanya Bharathi Institute of Technology");
//        cbit.setRegistered(true);
//        cbit.setCourses(new String[]{"MCA","MBA","B.Tech","M.Tech","Commerce"});
//        cbit.setYearlyGrowth(42.32);
//
//        String cbitDetails = cbit.toString();
//        System.out.println(cbitDetails);
//
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//
//        College klce = new College(42141);
//        String klceCollegeObjectDetails = klce.toString();
//        System.out.println(klceCollegeObjectDetails);
//
//        College bec = new College(34234,"Bapatla Engineering College");
//        String becCollegeObjectDetails = bec.toString();
//        System.out.println(becCollegeObjectDetails);

        College pbs = new College(76453, "P B Siddhartha College", true);
        String pbsCollegeObjectDetails = pbs.toString();
        System.out.println(pbsCollegeObjectDetails);

//        String[] newCollegeCourses = {"MA","B.Ed","B.Com"};
//        College newCollege = new College(85744, "New College", newCollegeCourses, false, 98.45);
//        String newCollegeObjectDetails = newCollege.toString();
//        System.out.println(newCollegeObjectDetails);


    }
}
