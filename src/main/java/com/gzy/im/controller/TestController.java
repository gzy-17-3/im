package com.gzy.im.controller;

import com.gzy.im.entity.User;
import com.gzy.im.repository.UserRepository;
import com.gzy.im.server.TestServer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @Resource
    TestServer testServer;

    @Resource
    UserRepository userRepository;

    //    访问 api 可以这样访问
    //    http://localhost:8080/register?username=ffff11111222&password=123456
    @RequestMapping("/register")
    public Object test(String username,String password){

        String name = username;

        User userByName = userRepository.findUserByName(name);
        if (userByName != null){
            return ResponseEntity.badRequest().body("已存在用户");
        }

        User user = new User();

        user.setName(name);
        user.setPassword(password);

        User user1 = userRepository.save(user);

        // 返回数据怎么转化成 json

        return user1;
    }

}
