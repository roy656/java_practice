package com.example.practice.java_interface_prac.re_practicing;

public class Player {

    private PlayerLevel level;

    public Player() {
        level = new BronzeLevel();
        level.showLevelMessege();
    }

    public void getLevel(){
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessege();
    }

    public void play(int count) {
        level.go(count);
    }


}
