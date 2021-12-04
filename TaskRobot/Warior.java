package com.it_cot.JavaLearn.TaskRobot;

public class Warior extends Hero{
    public Warior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " нанес удар мечом " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
