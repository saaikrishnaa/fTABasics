package com.fta.handson.config;

import org.aeonbits.owner.Config;

@Config.Sources(value = "file:${user.dir}/src/test/resources/properties/config.properties")
public interface FrameworkConfig extends Config {

    long duration();

    String url();

    String browser();

    boolean isHeadless();

    String runEnv();

    String remoteUrl();
}
