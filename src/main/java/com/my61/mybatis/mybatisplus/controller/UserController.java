package com.my61.mybatis.mybatisplus.controller;

import com.my61.mybatis.mybatisplus.mapper.UserMapper;
import com.my61.mybatis.mybatisplus.model.User;
import com.my61.mybatis.mybatisplus.model.enums.UserSexEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    
    @Autowired
    private UserMapper userMapper;
    
    @RequestMapping(value = "/alluser.do",method = RequestMethod.GET)
    public List<User> getallusers(Model model) {
       List<User> users=userMapper.getAll();
       model.addAttribute("users", users);
       return users;
    }
    @RequestMapping(value = "/insert.do",method = RequestMethod.GET)
    public User adduser(Model model) {
        log.info("请求开始：{}"+this.getClass());
       User user=new User();
       user.setName("王天霸");
       user.setAge(39);
       user.setSex(UserSexEnum.WOMAN);
       user.setPrice(BigDecimal.valueOf(878373.38383));
        userMapper.insert(user);
        System.out.println(user.getId());
       return user;
    }
}