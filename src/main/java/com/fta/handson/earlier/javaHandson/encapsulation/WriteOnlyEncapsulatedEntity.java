package com.fta.handson.earlier.javaHandson.encapsulation;

public class WriteOnlyEncapsulatedEntity {

    private Integer collegeId;
    private String collegeName;

    public void setCollegeId(Integer collegeId) {
        if (collegeId == null) {
            // This have to a log statement in real-time
            System.out.println("As the id is assigned a null value, re-assigning the id to a default value to avoid Null Pointer Exception");
            this.collegeId = 50000; //some random number generation logic
        } else if (collegeId <= 0) {
            // Have some random number generation logic here
            this.collegeId = 52352;
        } else {
            this.collegeId = collegeId;
        }
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    //This method can be related to, sending the college id and college name to some repository layer which will further stores in the backend DB
    //Just for your undersanding, we are displaying the values
    public void displayValues() {
        System.out.println("The values are - College Id -> " + collegeId + ", and College Name -> " + collegeName);
    }
}
