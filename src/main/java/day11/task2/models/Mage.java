package day11.task2.models;

import day11.task2.api.MagicAttack;

public class Mage extends Hero implements MagicAttack {
    public Mage() {
        physAtk = 5;
        magicAtk = 20;
        magicDef = 0.8;

    }

    @Override
    public void magicalAttack(Hero hero) {
        if(hero.health < magicAtk - (magicAtk * hero.magicDef)){
            hero.health = 0;
            return;
        }
        hero.health -= magicAtk - (magicAtk * hero.magicDef);

    }

    @Override
    public String toString() {
        return "Mage{" +
                "health=" + health +
                '}';
    }
}
