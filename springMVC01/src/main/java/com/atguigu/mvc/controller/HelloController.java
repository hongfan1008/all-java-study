package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/hello")
    public String hello(){

        return "target";

    }
    @RequestMapping(value = {"/testRequestMapping","/test"})
    public String testRequestMapperParam(){
        return "target";
    }
    @RequestMapping(value = {"/testRequestApi"})
    public String testRequestApi(HttpServletRequest request){
        request.setAttribute("name","张三");
        return "target";
    }
    @PostMapping("/postTest")
    public  String testPost(){
        return "target";
    }
    @RequestMapping(value = "/testParam",method = {RequestMethod.GET,RequestMethod.POST},params = {"username","password!=123456"})
    public String testRequestMappingParam(){
        return "target";
    }
    @RequestMapping("testRest/{id}/{username}")
    public String testRest(@PathVariable("id") String id, @PathVariable("username") String username){
        System.out.println("id:"+id+"-username:"+username);
        return "target";
    }


}
