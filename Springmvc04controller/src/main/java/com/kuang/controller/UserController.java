package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        // 1, 接受前端的参数
        System.out.println(name);
        // 2. 将返回的结果返回给前端
        model.addAttribute("msg",name);

        // 3, 跳转视图
        return "test";
    }

    /*
    1. 接受前端用户传递的参数, 判断参数的名字, 假设名字直接在方法上, 可以直接使用
    2. 假设, 传递的是一个User对象, 它会匹配User对象的字段名, 如果名字一致就OK. 否则匹配不到返回null.

     */
    @RequestMapping("t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }

    @RequestMapping("t3")
    public String test3(ModelMap modelMap){


        return "test";
    }

}
