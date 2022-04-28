package com.fta.handson.config;

import org.aeonbits.owner.ConfigFactory;

//none should extend this class - that's why final is used here
public final class ConfigurationFactory {

    //no one should create an object for this class, that's why private constructor is used
    private ConfigurationFactory(){
    }

    public static FrameworkConfig getConfig(){
        return ConfigFactory.create(FrameworkConfig.class);
    }
}
