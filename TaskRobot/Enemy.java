package com.it_cot.JavaLearn.TaskRobot;

public class Enemy implements Mortal {
    private int health;
    private String name;

    public Enemy(int health, String name) {
        this.health = health;
        this.name = name;
    }

    public void takeDamage(int damage) {
        if (isAlive() && this.health <= damage) {
            this.health = 0;
            System.out.println(getName() + " погиб");
        } else {
            this.health -= Math.min(this.health, damage);
            System.out.println(name + " получил урон " + damage + " осталось " + this.health);
        }
    }

    @Override
    public boolean isAlive() {
        if (this.health > 0) {
            return true;
        }
        return false;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

}
