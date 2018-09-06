package com.xu.testng;

import org.testng.annotations.Test;

//多线程：注解
public class MultiThreadOnAnnotion {

    public MultiThreadOnAnnotion(){

    }

    @Test(invocationCount = 10, threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread id: %s%n", Thread.currentThread().getId());
    }
}
