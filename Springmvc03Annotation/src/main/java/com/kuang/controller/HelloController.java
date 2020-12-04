package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("helloController")
public class HelloController {


    //真实的访问地址:项目名/helloController/hello
    @RequestMapping("/hello")
    public String hello(Model model){
        /*
        封装数据
        向模型中添加属性msg与值,可以在jsp页面中取出并渲染
         */
        model.addAttribute("msg", "Hello, SpringMVC");

        // WEB-INF/jsp/hello.jsp
        return "hello"; // 这个返回结果, 会被视图解析器处理
    }
}
