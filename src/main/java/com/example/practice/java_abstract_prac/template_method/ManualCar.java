package com.example.practice.java_abstract_prac.template_method;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람이 주행을 합니다");
        System.out.println("운전자가 핸들을 조작해 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("장애물로 인해 운전자가 브레이크를 밟아 정지 합니다");
    }

    @Override
    public void washCar() {                         // 반드시 구현해야 하는 추상메서드는 아니지만 필요에 의해서 재정의하여 구현할수 있는 메서드.
        System.out.println("주행이 끝난 뒤 세차를 합니다.");
    }
}
