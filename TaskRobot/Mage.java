package com.it_cot.JavaLearn.TaskRobot;

public class Mage extends Hero {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " нанес урон магией " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
