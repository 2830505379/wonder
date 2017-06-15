package com.star.test;

import com.star.tools.logback.LogUtil;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by star on 2017/4/24.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    public static void main(String[] args) {

        LogUtil.info("test main");
    }
}
