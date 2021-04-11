package com.example.testweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class TestController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String getBody() {
        return "ok";
    }
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String testBody() {
        return "ok";
    }
}
