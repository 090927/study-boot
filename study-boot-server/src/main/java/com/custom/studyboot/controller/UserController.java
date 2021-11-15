package com.custom.studyboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@RestController
public class UserController {

    @RequestMapping("/hello")
    public String getHello() {
        return "ok";
    }

}
