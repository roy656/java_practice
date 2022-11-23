package com.example.practice.java_exception_prac.throws_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    // 예제를 위해 생성한 연관없는 메소드들
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);    // FileInputStream 에 대한 Exception 을 throws 함.
        Class c = Class.forName(className);     // forName 에 대한 Exception 을 throws 함.
        return c;                               // throws 를 하게 되면 해당 메소드가 호출되는 곳에서 예외처리 핸들링을 하게 됨.
    }

    public static void main(String[] args) {

        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("a.txt", "abc");     // loadClass 메소드 호출시 예외처리를 요구함.
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch ( Exception e) {        // 최상위 Exception 을 넣으면 default exception 으로, 위의 예외들 외의 다른 예외들을 여기에 걸린다.

        }

        System.out.println("계속 실행중");       // try catch 로 예외처리를 해주었기 때문에 비정상 종료 되지 않고 프로그램은 계속 실행중.

    }
}

/* try catch 를 사용할때 여러 exception 에 대해 로그를 남길때 위와같은 방법 혹은

    try {
        test.loadClass("a.txt", "abc");
    } catch ( FileNotFoundException | ClassNotFoundException e) {   와 같이 하나의 블럭에 한번에 처리 할 수도 있다.
        e.printStackTrace();
 */