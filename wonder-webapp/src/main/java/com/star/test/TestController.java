package com.star.test;

import org.springframework.stereotype.Controller;
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
}
