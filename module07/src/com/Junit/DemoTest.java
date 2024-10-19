package com.Junit;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    //单元测试-Junit框架
    //1.可针对单个方法单独测试
    //2.也可以对一键完成全部方法的自动化测试，且各自独立，单个方法测试失败不影响其他方法的测试
    //3.自动生成报告


    //@Test注解
    @Test
    //测试方法需：公共，无返回值类型，无参
    public void testPrintNumber(){
        Demo.printNumber("admin");
        Demo.printNumber(null);
    }

    @Test
    public void testGetMaxIndex(){
        int len1 = Demo.getMaxIndex(null);
        System.out.println(len1);

        int len2 = Demo.getMaxIndex("admin");
        System.out.println(len2);

        //断言机制
        Assert.assertEquals("长度与预期不符!",4,len2);

    }

    //@Before BeforeEach  修饰测试类的一个实例方法，该方法将在每个测试方法执行前执行一次，用于初始化非公有资源
    //@After AfterEach         后,用于释放非公有资源

    //@BeforeClass BeforeAll  修饰测试类的一个静态方法，该方法将在所有测试方法执行前执行一次，用于初始化公有资源
    //@AfterClass AfterAll    后,用于释放公有资源
}
