package com.star.tools.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hxx9048
 * @since 2017/5/15
 */
public class LogUtil {

    private static Logger _LOG = LoggerFactory.getLogger(LogUtil.class);

    public static void info(String msg,Object... arguments) {
        _LOG.info(msg,arguments);
    }
    public static void error(String msg,Object... arguments) {
        _LOG.error(msg,arguments);
    }
    public static void debug(String msg,Object... arguments) {
        _LOG.debug(msg,arguments);
    }
}
