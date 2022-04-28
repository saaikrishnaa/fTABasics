package com.fta.handson.java.abstraction;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface OnPremiseEnvironment {

    void getOnPremiseDetails();
    void getProxyDetails();
    void getLoadBalancerDetails();
    public void avoidMultipleInheritance();
    public Set<Integer> rectifyMultipleInheritance(List<String> strings, Map<String, Object> map);
}
