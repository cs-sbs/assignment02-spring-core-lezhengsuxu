package org.example.service;

public class AopDemoServiceImpl {

    public void doMethod1() {
        System.out.println("AopDemoServiceImpl.doMethod1");
    }


    public String doMethod2() {
        System.out.println("AopDemoServiceImpl.doMethod2");
        return "doMethod2 hello";
    }

    public String doMethod3() throws Exception {
        System.out.println("AopDemoServiceImpl.doMethod3");
        throw new Exception("AopDemoServiceImpl Exception");
    }

}
