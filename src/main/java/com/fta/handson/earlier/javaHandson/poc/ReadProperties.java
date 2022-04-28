package com.fta.handson.earlier.javaHandson.poc;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}/src/test/resources/application-dev.properties")
public interface ReadProperties extends Config {

    String url();
    String username();
    String password();

    int version();

    String[] technologies();

}
