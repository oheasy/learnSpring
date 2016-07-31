package com.hxy.controller;

import com.hxy.pojo.User;
import com.hxy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hxy-pc on 2016/7/19.
 */
@Controller
public class MyController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndex(Map map) {
        User user = userService.queryByName("hxy");
        map.put("user", user);
        return "index";
    }

    @RequestMapping(value = "/retuser", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> retUser() {
        User user = new User();
        user.setName("houxiaoyu");
        user.setAge(49);
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("key2", "value2");
        return map;
    }
}
