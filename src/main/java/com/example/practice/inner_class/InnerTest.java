package com.example.practice.inner_class;

class OutClass {

    private int num = 10;
    private static  int sNum = 20;
    private InClass inClass;

    public OutClass() {             // Inner Class 는 Out Class 가 먼저 생성 되고 난 후에 생성 가능.
        inClass = new InClass();
    }


    private class InClass {             // 그렇기 때문에 Inner Class 에서는 static 변수를 사용할 수 없다 ( static 변수는 객체의 생성과 상관 없이 쓸수 있으므로)

        int iNum = 100;

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + num + "(외부 클래스의 static 변수)");
            System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");

        }
    }

    public void usingClass() {
        inClass.inTest();
    }

    static class InStaticClass {

        int iNum = 100;
        static int sINum = 200;

        void inTest() {         // 외부 클래스의 Instance 변수는 사용 불가. 클래스 객체 생성이 안되었을수 있기 때문에.
            System.out.println("InClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");
            System.out.println("InClass sNum = " + sINum + "(내부 클래스의 인스턴스 변수)");
        }

        static void sTest() {
//            System.out.println("InClass num = " + iNum + "(내부 클래스의 인스턴스 변수)");        // static 메서드는 객체 생성과 상관없이 호출됡수 있기 때문에
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 static 변수)");      // 해당 변수는 생성이 안되었을수 있기 때문에 사용 불가
            System.out.println("InClass sNum = " + sINum + "(내부 클래스의 인스턴스 변수)");
        }

    }
}

public class InnerTest {

    public static void main(String[] args) {

//        OutClass outClass = new OutClass();       // 내부 클래스 사용.
//        outClass.usingClass();

        OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();    // 외부 클래스에서 바로 static 클래스 생성 가능.
        inStaticClass.inTest();


        OutClass.InStaticClass.sTest();
    }
}
