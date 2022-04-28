package com.fta.handson.earlier.javaHandson.runner;

import com.fta.handson.earlier.javaHandson.encapsulation.WriteOnlyEncapsulatedEntity;

public class EncapsulationRunner {
    public static void main(String[] args) {

//        UnderstandEncapsulation encapsulatedObject = new UnderstandEncapsulation();
//        encapsulatedObject.setId(null); //This is a exception scenario, but we can even avoid these using Encapsulation
//        encapsulatedObject.setName("NAME");
//        encapsulatedObject.displayValues();

//        ReadOnlyEncapsulatedEntity readOnly = new ReadOnlyEncapsulatedEntity();
//        readOnly.displayValues();

//

        WriteOnlyEncapsulatedEntity writeOnly = new WriteOnlyEncapsulatedEntity();
        writeOnly.setCollegeId(null);
        writeOnly.setCollegeName("New College");
        writeOnly.displayValues();

//        UnderstandEncapsulation object = new UnderstandEncapsulation();
//        object.displayValues();



    }
}
