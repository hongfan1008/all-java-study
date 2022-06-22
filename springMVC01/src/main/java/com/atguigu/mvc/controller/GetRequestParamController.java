package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class GetRequestParamController {
    //SpringMVC获取请求参数


    //1、通过ServletAPI获取
    @RequestMapping("/testParam2")
    public String testParam(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:"+username+"----password:"+password);
        return "target";
    }

    //2、通过控制器方法的形参获取请求参数
    @RequestMapping("/testParam3")
    public String testParam(String username, String password){
        System.out.println("username:"+username+",password:"+password);
        return "target";
    }

    //3、@RequestParam
    @RequestMapping("/testParam4")
    public String testParam3(@RequestParam("username") String account,@RequestParam("password")String pass){
        System.out.println("username:"+account+",password:"+pass);
        return "target";
    }

}
