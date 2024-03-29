package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class ScopeController {

    //域对象共享数据

    //1、使用ServletAPI向request域对象共享数据
    @RequestMapping("testServletAPI")
    public String testServletAPI(HttpServletRequest request){
        request.setAttribute("testRequestScope","admin");
        return "target";
    }
    //2、使用ModelAndView向request域对象共享数据
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testRequestScope","789465");
        modelAndView.setViewName("target");
        return modelAndView;
    }
    //3、使用Model向request域对象共享数据
    @RequestMapping("/testModel")
    public String testModel(Model model){

        model.addAttribute("testRequestScope","78788798");
        return "target";
    }

    //4、使用map向request域对象共享数据

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map){

        map.put("testRequestScope", "hello,Map");
        return "target";
    }
    //5、使用ModelMap向request域对象共享数据
    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope", "hello,ModelMap");
        return "target";
    }
    //7、向session域共享数据
    @RequestMapping("/testSession")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope", "hello,session");
        System.out.println();
        return "target";
    }
    //8、向application域共享数据
    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplicationScope", "hello,application");
        return "target";
    }

}
