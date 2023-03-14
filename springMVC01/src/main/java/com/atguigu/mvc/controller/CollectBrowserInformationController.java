package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CollectBrowserInformationController {
    @RequestMapping(value = "/collectBrowserInformation",method = RequestMethod.GET)
    public String collectBrowserInformationController(HttpServletRequest request){
        /*获取请求IP*/
        String requestIp = IpAndAddrUtil.getIp(request);
        /*获取发起请求的浏览器版本号*/
        String browserVersion = IpAndAddrUtil.getBrowserVersion(request);
        /*获取发起请求的操作系统名称*/
        String osName = IpAndAddrUtil.getOsName(request);
        /*获取发起请求的浏览器名称*/
        String browserName = IpAndAddrUtil.getBrowserName(request);
        int remotePort = request.getRemotePort();
        request.setAttribute("remotePort",remotePort);
        request.setAttribute("requestIp",requestIp);
        request.setAttribute("browserVersion",browserVersion);
        request.setAttribute("osName",osName);
        request.setAttribute("browserName",browserName);
        return "target";
    }
}
