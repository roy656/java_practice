package com.example.practice.java_io_stream_prac.decorator_pattern;

/*
 Decorator Pattern 으로 여러종류의 커피 만들기 예제
 상속 대비 확장성이 좋은편
 */

public class CoffeeTest {

    public static void main(String[] args) {

        // 에티오피아 아메리카노
        Coffee ethiopiaCoffee = new EthiopiaAmericano();
        ethiopiaCoffee.brewing();

        // 에티오피아 라떼
        System.out.println();
        Coffee ethiopiaLatte = new Latte(ethiopiaCoffee);
        ethiopiaLatte.brewing();

        // 에티오피아 차이라떼
        System.out.println();
        Coffee chaiLatte = new Cinnamon(new Latte(new EthiopiaAmericano()));
        // 혹은 Coffee chaiLatte = new Cinnamon(ethiopiaLatte);
        chaiLatte.brewing();

        // 케냐 아메리카노
        System.out.println();
        Coffee kenyaCoffee = new KenyaAmericano();
        kenyaCoffee.brewing();

        // 케냐 헤이즐넛 커피
        System.out.println();
        Coffee hazelnutCoffee = new Hazelnut(kenyaCoffee);
        // 혹은 Coffee hazelnutCoffee = new Hazelnut(new KenyaAmericano());
        hazelnutCoffee.brewing();
    }
}
