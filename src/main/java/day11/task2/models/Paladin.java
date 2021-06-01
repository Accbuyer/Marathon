package day11.task2.models;

import day11.task2.api.Heal;

public class Paladin extends Hero implements Heal {
    public Paladin() {
        physAtk = 15;
        physDef = 0.5;
        magicDef = 0.2;

    }

    @Override
    public void healHimself() {
        if(MAX_HEALTH < health + 25){
            health = 100;
            return;
        }
        health += 25;
    }

    @Override
    public void healTeammate(Hero hero) {
        if(MAX_HEALTH < hero.health + 10){
            hero.health = 100;
            return;
        }
        hero.health += 10;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
