package com.star.tools.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hxx9048
 * @since 2017/5/15
 */
public class LogUtil {

    private static Logger _LOG = LoggerFactory.getLogger(LogUtil.class);

    public static void info(String msg) {
        _LOG.info(msg);
    }
    public static void error(String msg) {
        _LOG.error(msg);
    }
    public static void debug(String msg) {
        _LOG.debug(msg);
    }
}
