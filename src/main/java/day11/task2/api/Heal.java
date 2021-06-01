package day11.task2.api;

import day11.task2.models.Hero;

public interface Heal {
    void healHimself();
    void healTeammate(Hero hero);
}
