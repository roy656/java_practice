package com.example.practice.java_interface_prac.domain.userinfo.dao;

import com.example.practice.java_interface_prac.domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);

}
