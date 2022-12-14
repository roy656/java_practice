package com.example.practice.java_exception_prac.autoclose;

/*

try-with-resources 문

리소스를 사용하는 경우 close() 하지 않아도 자동으로 해제 되도록 함

자바 7부터 제공되는 구문

리소스를 try() 내부에서 선언해야만 함

close()를 명시적으로 호출하지 않아도 try{}블록에서 열린 리소스는 정상적인 경우나 예외가 발생한 경우 모두 자동으로 해제됨

해당 리소스 클래스가 AutoCloseable 인터페이스를 구현 해야 함

FileInputStream 의 경우에는 AutoCloseable 을 구현하고 있음

자바 9 부터 리소스는 try() 외부에서 선언하고 변수만을 try(obj) 와 같이 사용할 수 있음

Ex) AutoCloseObj obj = new AutoCloseObj();
    	try (obj) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 부분 입니다");
		}

 */


public class AutoCloseTest {

    public static void main(String[] args) {

        try(AutoCloseableObj obj = new AutoCloseableObj();) {   // AutoCloseable 을 구현한 클래스 이기 때문에
                                                                // try 문이 수행이 끝나면 Auto Close 가 된다.
            throw new Exception();      // 강제 Exception 발생 시키기
        } catch (Exception e) {
            System.out.println("Exception");
        }

        System.out.println("end");
    }
}
