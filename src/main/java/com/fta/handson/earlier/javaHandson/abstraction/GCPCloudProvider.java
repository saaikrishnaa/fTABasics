package com.fta.handson.earlier.javaHandson.abstraction;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface GCPCloudProvider extends MultiCloudEnvironment {

    String[] getGoogleDataCentreDetails();
    String[] getGCPServiceDetails();
    public Set<Integer> rectifyMultipleInheritance(List<String> strings, Map<String, Object> map);

}
