package com.it_cot.JavaLearn.TaskRobot;

public abstract class Hero {
    private String name;
    private int damage;
    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    public String getName() {
        return this.name;
    }
    public int getDamage() {
        return this.damage;
    }
}
