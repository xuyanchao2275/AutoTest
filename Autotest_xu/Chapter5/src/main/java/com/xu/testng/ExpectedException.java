package com.xu.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    /**
     * 什么时候用到？
     * 我们期待结果为异常
     * 如：输入不合法参数，抛出异常
     */
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void tunTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();
    }
}
