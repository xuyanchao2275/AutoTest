package com.xu.testng;

import org.testng.annotations.*;


public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1() {
        System.out.println("Test：测试用例1");

    }

    @Test
    public void testCase2() {
        System.out.println("Test：测试用例2");

    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod：是测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod：是测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass：这是类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("afterClass：这是在类运行之后运行的方法");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("beforeTest：测试执行前运行");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("afterTest：测试执行后运行");
    }

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("测试套件：BeforeSuit");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("测试套件：AfterSuit");
    }

    @Test
    public void test1() {
        //System.out.println();
        System.out.printf("Thread id : %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        //System.out.println();
        System.out.printf("Thread id : %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        //System.out.println();
        System.out.printf("Thread id : %s%n", Thread.currentThread().getId());
    }
}