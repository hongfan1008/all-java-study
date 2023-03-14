package com.atguigu.mvc.contoller;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestController {
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public String hello(@PathVariable Integer id){
        System.out.println("test rest get:" + id);
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
    public String hello() {
        System.out.println("test POST:");
        return "success";
    }
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String helloDelete(@PathVariable Integer id) {
        System.out.println("test rest delete:" + id);
        return "success";
    }
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public String helloPUt(@PathVariable Integer id) {
        System.out.println("test rest put:" + id);
        return "success";
    }
}
