package com.example.practice.java_static_prac.singleton_pattern;

public class Company {      // Singleton 패턴 예제

    private static Company instance = new Company();    // 하나만 있는 유일한 Company 로 만들기 위해 내부에서 private 으로 생성.
    private Company() {     // 자동으로 만들어지는 기본 생성자로 인해 외부에서 Company 객체가 여러개 생성되는것을 방지하기 위해 private
    }

    public static Company getInstance() {       // 일반 메서드일 경우 인스턴스를 생성하고 사용할수 있기 때문에
                                                // 외부에서 클래스명으로 호출 가능하도록 static 메서드로 적용
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
