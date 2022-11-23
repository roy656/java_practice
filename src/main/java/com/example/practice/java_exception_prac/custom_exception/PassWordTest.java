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

        PassWordTest test = new PassWordTest();

        String passWord = null;                     // password 의 유형 별 예외 메세지 출력 비교

        try {
            test.setPassWord(passWord);
            System.out.println("오류없음");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }

        passWord = "abc";

        try {
            test.setPassWord(passWord);
            System.out.println("오류없음2");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }

        passWord = "abcde";

        try {
            test.setPassWord(passWord);
            System.out.println("오류없음3");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }

        passWord = "abcde123!";

        try {
            test.setPassWord(passWord);
            System.out.println("오류없음4");
        } catch (PassWordException e) {
            System.out.println(e.getMessage());
        }

    }
}
