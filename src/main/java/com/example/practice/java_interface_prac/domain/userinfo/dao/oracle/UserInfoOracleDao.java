package com.example.practice.java_interface_prac.domain.userinfo.dao.oracle;

import com.example.practice.java_interface_prac.domain.userinfo.UserInfo;
import com.example.practice.java_interface_prac.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB userId = " + userInfo.getUserId());
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("update into Oracle DB userId = " + userInfo.getUserId());
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("delete into Oracle DB userId = " + userInfo.getUserId());
    }
}
