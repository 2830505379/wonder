package com.star.tools.logback;

import ch.qos.logback.classic.filter.ThresholdFilter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.spi.FilterReply;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by star on 2017/6/14.
 */
public class MyThresholdFilter extends ThresholdFilter {

    private static final Set<String> ignoreClass=new HashSet<String>();

    static {
        ignoreClass.add("org.springframework.test.context.support.AbstractTestContextBootstrapper");
        ignoreClass.add("org.springframework.context.support.AbstractApplicationContext");
        ignoreClass.add("org.springframework.beans.factory.xml.XmlBeanDefinitionReader");
    }
    @Override
    public FilterReply decide(ILoggingEvent event) {
        if(thirdJarLogFilter(event)){
            return FilterReply.DENY;
        }
        return super.decide(event);
    }

    private boolean thirdJarLogFilter(ILoggingEvent event){
        StackTraceElement[] cda = event.getCallerData();
        if (cda != null && cda.length > 0) {
            if (ignoreClass.contains(cda[0].getClassName())) {
                return true;
            }
        }
        return false;
    }
}
