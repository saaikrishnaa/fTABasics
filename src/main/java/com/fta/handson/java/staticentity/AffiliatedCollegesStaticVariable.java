package com.fta.handson.java.staticentity;

public class AffiliatedCollegesStaticVariable {
    private String collegeName;
    private Integer uniqueCollegeId;
    public static boolean isCampusPlacementsProvided;
    public static String universityName = "Acharya Nagarjuna University";

    public AffiliatedCollegesStaticVariable() {
    }

    public AffiliatedCollegesStaticVariable(String collegeName, Integer uniqueCollegeId, Boolean isCampusPlacementsProvided) {
        this.collegeName = collegeName;
        this.uniqueCollegeId = uniqueCollegeId;
        this.isCampusPlacementsProvided = isCampusPlacementsProvided;
    }

    @Override
    public String toString() {
        return "AffiliatedColleges{" +
                "collegeName='" + collegeName + '\'' +
                ", uniqueCollegeId=" + uniqueCollegeId +
                ", isCampusPlacementsProvided=" + isCampusPlacementsProvided +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
