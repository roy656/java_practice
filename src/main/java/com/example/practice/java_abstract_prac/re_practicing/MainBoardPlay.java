package com.example.practice.java_abstract_prac.re_practicing;

public class MainBoardPlay {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        SilverLevel silver = new SilverLevel();
        player.upgradeLevel(silver);
        player.play(2);

        GoldLevel gold = new GoldLevel();
        player.upgradeLevel(gold);
        player.play(3);

    }
}
