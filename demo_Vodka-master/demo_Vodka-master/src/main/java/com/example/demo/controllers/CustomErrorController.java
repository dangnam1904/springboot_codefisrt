package com.example.demo.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

public class CustomErrorController implements ErrorController {
    @RequestMapping("/error")
    @ResponseBody
    String error(HttpServletRequest request) {
        return "<h1>Error occurred</h1>";
    }
    public String getErrorPath() {
        return "/error";
    }
}
