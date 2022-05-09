package com.fta.handson.pojo;

import com.creditdatamw.zerocell.annotation.Column;

public class TestData {

    @Column(index = 0, name = "testcasename")
    public String testName;

    @Column(index=1, name="username")
    public String username;

    @Column(index=2, name="password")
    public String password;
}
