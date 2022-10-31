package com.example.practice.java_interface_prac.basic_using_interface.domain.userinfo.dao;

import com.example.practice.java_interface_prac.basic_using_interface.domain.userinfo.UserInfo;

public interface UserInfoDao {

    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);

}
