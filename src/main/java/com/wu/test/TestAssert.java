package com.wu.test;

import org.junit.jupiter.api.Test;

public class TestAssert {

    @Test
    public void test(){

        boolean flag=true;
        assert  flag:"cuowu";
        System.err.println("sss");
    }
}
