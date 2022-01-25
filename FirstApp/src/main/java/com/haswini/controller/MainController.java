package com.haswini.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value="/hello")
    public String greeting()
    {
        return "Hello world!";
    }

}
