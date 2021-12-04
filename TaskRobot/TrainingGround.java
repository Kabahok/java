package com.it_cot.JavaLearn.TaskRobot;

public class TrainingGround {
    public static void main(String[] args) {
        String wariorName = "Cod";
        String mageName = "Red";
        String archerName = "Joe";
        String enemyName = "Gik";
        int healtEnemy = 100;
        Hero warior = new Warior(wariorName, 15);
        Hero mage = new Mage(mageName, 10);
        Hero archer = new Archer(archerName, 20);
        Enemy enemy = new Enemy(healtEnemy, enemyName);

        attackEnemy(enemy, warior, mage, archer);
    }

    public static void attackEnemy(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.getHealth() != 0) {
                    hero.attackEnemy(enemy);
                } else {
                    break;
                }
            }
        }
    }
}
