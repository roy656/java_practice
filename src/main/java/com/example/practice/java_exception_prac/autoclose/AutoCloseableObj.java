package com.example.practice.java_exception_prac.autoclose;

public class AutoCloseableObj implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("closing....");
    }
}
