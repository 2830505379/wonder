package com.star.tool.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by star on 2017/6/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context-test.xml"})
public class BaseTest {

    @Test
    public void test1(){
        System.out.println(new Object().hashCode());
        System.out.println(new Object().hashCode());
        System.out.println("tets1");
        Float.floatToIntBits()
    }
}
