package com.xu.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000)//单位是毫米级别
    public void testSucess() throws InterruptedException{
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFiled() throws InterruptedException{
        Thread.sleep(3000);
    }
}
