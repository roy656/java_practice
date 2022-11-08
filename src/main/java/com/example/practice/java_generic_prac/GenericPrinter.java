package com.example.practice.java_generic_prac;

public class GenericPrinter<T> {

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
