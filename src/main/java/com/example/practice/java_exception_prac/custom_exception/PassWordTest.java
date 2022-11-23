package com.example.practice.java_exception_prac.custom_exception;

public class PassWordTest {

    private String passWord;

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) throws PassWordException {

        if(passWord == null) {
            throw new PassWordException("password 는 비어있을수 없습니다");
        } else if(passWord.length() < 5 ) {
            throw new PassWordException("password 는 5자 이상이어야 합니다");
        } else if(passWord.matches("[a-zA-Z]+")) {
            throw new PassWordException("password 는 숫자나 특수문자를 포함해야 합니다");
        }

        this.passWord = passWord;
    }





    public static void main(String[] args) {

    }
}
