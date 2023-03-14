package com.atguigu.mvc.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVCController {
   @RequestMapping("/success")
    public String success(){
        return "success";
    }

    @RequestMapping("/torest")
    public String torest() {
        return "rest";
    }
}
