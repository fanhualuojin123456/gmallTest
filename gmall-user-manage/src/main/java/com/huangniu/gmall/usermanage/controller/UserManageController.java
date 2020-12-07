package com.huangniu.gmall.usermanage.controller;

import com.huangniu.gmall.usermanage.bean.UserInfo;
import com.huangniu.gmall.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserManageController {


    @Autowired
    private UserService userService;


    @RequestMapping("findAll")
    @ResponseBody
    public List<UserInfo> findAll(){
        return userService.getUserInfoListAll();
    }
}
