package com.huangniu.gmall.usermanage.service.impl;

import com.huangniu.gmall.usermanage.bean.UserInfo;
import com.huangniu.gmall.usermanage.mapper.UserInfoMapper;
import com.huangniu.gmall.usermanage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> getUserInfoListAll() {
        return userInfoMapper.selectAll();
    }
}
