package com.oyr.user.service.impl;

import com.oyr.user.service.UserService;

/**
 * Create by 欧阳荣
 * 2018/5/17 0:26
 */
public class UserServiceImpl implements UserService {
    public String findByName(String id) {
        if(id.equals("1")){
            return "欧阳荣";
        }else if(id.equals("2")){
            return "韩顺平";
        }else if(id.equals("3")){
            return "入云龙";
        }
        return "没有找到name";
    }
}
