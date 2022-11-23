package com.example.practice.java_exception_prac.custom_exception;

// 적절한 예외 클래스를 상속 하는 커스텀 예외 클래스 생성

public class PassWordException extends IllegalArgumentException {

    public PassWordException(String message) {
        super(message);
    }
}
