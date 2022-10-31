package com.example.practice.java_interface_prac.domain.userinfo.dao.mysql;

import com.example.practice.java_interface_prac.domain.userinfo.UserInfo;
import com.example.practice.java_interface_prac.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {


    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Mysql DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into Mysql DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into Mysql DB userId = " + userInfo.getUserId());
    }
}
