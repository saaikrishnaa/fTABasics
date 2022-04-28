package com.fta.handson.java.inheritance;

public class AccessingProtectedMemberWithinPackage extends StudentType{

    public static void main(String[] args) {
        StudentType studentType = new StudentType();
        studentType.toDemonstrateProtectedModifier();

        AccessingProtectedMemberWithinPackage protectedRunner = new AccessingProtectedMemberWithinPackage();
        protectedRunner.toDemonstrateProtectedModifier();

        StudentType studentType1 = new AccessingProtectedMemberWithinPackage();
        studentType1.toDemonstrateProtectedModifier();
    }
}
