package com.example.practice.java_interface_prac.basic_using_interface.web.userinfo;

import com.example.practice.java_interface_prac.basic_using_interface.domain.userinfo.dao.UserInfoDao;
import com.example.practice.java_interface_prac.basic_using_interface.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import com.example.practice.java_interface_prac.basic_using_interface.domain.userinfo.dao.oracle.UserInfoOracleDao;
import com.example.practice.java_interface_prac.basic_using_interface.domain.userinfo.UserInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");     // 파일을 읽어들인다.

        Properties prop = new Properties();    // 파일 안의 데이터를 pair 쌍으로 읽어들일수 있는 클래스.
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");     // prop 으로 읽어온 파일안의 프로퍼티를 입력하면 해당되는 value 를 불러와 준다.

        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("10001");
        userInfo.setUserName("Roy");
        userInfo.setUserPassword("1234");

        UserInfoDao userInfoDao = null;

        if (dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if (dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMysqlDao();
        } else {
            System.out.println("db error");
            return;
        }

        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);
    }
}
