package day11.task2.models;

import day11.task2.api.Heal;
import day11.task2.api.MagicAttack;

public class Shaman extends Hero implements MagicAttack, Heal {

    public Shaman() {
        physAtk = 10;
        magicAtk = 15;
        physDef = 0.2;
        magicDef = 0.2;

    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.health -= magicAtk - (magicAtk * hero.magicDef);
    }

    @Override
    public void healHimself() {
        if(MAX_HEALTH < health + 50){
            health = 100;
            return;
        }
        health += 50;
    }

    @Override
    public void healTeammate(Hero hero) {
        if(MAX_HEALTH < hero.health + 30){
            hero.health = 100;
            return;
        }
        hero.health += 30;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
