package com.netcracker.parfenenko.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class IndexController {

    @GetMapping("/")
    public String home(ModelMap model) {
        model.put("message", "JSP!!!");
        return "index";
    }

    @GetMapping("/next")
    public String next(Map<String, Object> model) {
        model.put("message", "next JSP!!!");
        return "next";
    }
}