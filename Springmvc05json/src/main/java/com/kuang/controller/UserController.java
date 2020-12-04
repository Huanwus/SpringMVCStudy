package com.kuang.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kuang.pojo.User;
import com.kuang.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

//@Controller // 方法会走视图解析器
@RestController // 只会返回字符串
public class UserController {

    @RequestMapping(value = "/j1")
    //@ResponseBody // 他就不会找视图解析器,会直接返回一个字符串, 配合controller使用的
    public String json1() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("吴晗", 12, "男");
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping(value = "/j2")
    public String json2() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        List<User> userList = new ArrayList<User>();

        User user = new User("吴晗", 12, "男");
        User user1 = new User("吴晗", 12, "男");
        User user2 = new User("吴晗", 12, "男");
        User user3 = new User("吴晗", 12, "男");

        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        String str = mapper.writeValueAsString(userList);
        return str;
    }

    @RequestMapping(value = "/j3")
    public String json3() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        Date date = new Date();
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = mapper.writeValueAsString(simpleFormatter.format(date));
        return str;
    }
    @RequestMapping(value = "/j4")
    public String json4() throws JsonProcessingException {
        Date date = new Date();
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping(value = "/j5")
    public String json5() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();

        User user = new User("吴晗", 12, "男");
        User user1 = new User("吴晗", 12, "男");
        User user2 = new User("吴晗", 12, "男");
        User user3 = new User("吴晗", 12, "男");

        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        return JsonUtils.getJson(userList);
    }


    @RequestMapping(value = "/j6")
    public String json6() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();

        User user = new User("吴晗", 12, "男");
        User user1 = new User("吴晗", 12, "男");
        User user2 = new User("吴晗", 12, "男");
        User user3 = new User("吴晗", 12, "男");

        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        String s = JSON.toJSONString(userList);
        return s;

    }


}
