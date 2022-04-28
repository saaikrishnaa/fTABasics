package com.fta.handson.java.staticentity;

public class AffiliatedCollegesStaticMethod {
    private static String collegeName;
    private static Integer uniqueCollegeId;
    private Boolean isCampusPlacementsProvided;
    private static String universityName = "My University";

    public AffiliatedCollegesStaticMethod() {
    }

    public AffiliatedCollegesStaticMethod(String collegeName, Integer uniqueCollegeId, Boolean isCampusPlacementsProvided) {
        this.collegeName = collegeName;
        this.uniqueCollegeId = uniqueCollegeId;
        this.isCampusPlacementsProvided = isCampusPlacementsProvided;
    }


    public String toString() {
        return "AffiliatedColleges{" +
                "collegeName='" + collegeName + '\'' +
                ", uniqueCollegeId=" + uniqueCollegeId +
                ", isCampusPlacementsProvided=" + isCampusPlacementsProvided +
                ", universityName='" + universityName + '\'' +
                '}';
    }

    public static void getCollegeDetails() {
//        System.out.println("Can I use static variables within static context? -" + "College Name - " + collegeName + ", College Id - " + uniqueCollegeId);
//        System.out.println("Can I use non-static/instance variables within static context? -" + "Are Campus Placements Provided? - " + isCampusPlacementsProvided);
//        System.out.println("Can I use this inside static context? - " + this.universityName);
//        System.out.println("Can I use super from within the static context -? " + super.toString());
        System.out.println("Some implementation");
    }

    public static String proofThatNonStaticMethodCanBeAccessed() {
        return "";
    }
}
