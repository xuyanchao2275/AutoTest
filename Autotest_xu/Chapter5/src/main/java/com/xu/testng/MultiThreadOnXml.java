package com.xu.testng;

import org.testng.annotations.Test;

public class MultiThreadOnXml {

    @Test
    public void test1(){
        //System.out.println();
        System.out.printf("Thread id : %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        //System.out.println();
        System.out.printf("Thread id : %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        //System.out.println();
        System.out.printf("Thread id : %s%n", Thread.currentThread().getId());
    }
}
