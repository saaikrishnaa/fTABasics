package com.fta.handson.java.runner;

import com.fta.handson.java.inheritance.StudentType;

public class AccessingProtectedMemberOutsidePackage extends StudentType {


    public static void main(String[] args) {
//        StudentType studentType = new StudentType();
//        studentType.toDemonstrateProtectedModifier();

        AccessingProtectedMemberOutsidePackage protectedRunner = new AccessingProtectedMemberOutsidePackage();
        protectedRunner.toDemonstrateProtectedModifier();

//        StudentType studentType1 = new AccessingProtectedMemberOutsidePackage();
//        studentType1.toDemonstrateProtectedModifier();
    }
}
