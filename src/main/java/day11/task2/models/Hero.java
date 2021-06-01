package day11.task2.models;

import day11.task2.api.PhysAttack;

public abstract class Hero implements PhysAttack {
    static final int MAX_HEALTH = 100;
    static final int MIN_HEALTH = 0;
    int physAtk;
    int magicAtk;
    double physDef;
    double magicDef;
    int health;

    public Hero() {
        health = 100;
    }
    @Override
    public void physicalAttack(Hero hero) {
        if(hero.health < physAtk - (physAtk * hero.physDef)){
            hero.health = 0;
            return;
        }
        hero.health -= physAtk - (physAtk * hero.physDef);
    }

}
