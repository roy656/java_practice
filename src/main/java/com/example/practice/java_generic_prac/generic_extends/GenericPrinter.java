package com.example.practice.java_generic_prac.generic_extends;

public class GenericPrinter<T extends Material> {       // 상속을 사용해서 T 에 사용 가능한 타입 제한하기.

    private T material;         // T 는 type parameter 의 대체문자

    public T getMaterial() {
        return material;
    }
    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }

}
