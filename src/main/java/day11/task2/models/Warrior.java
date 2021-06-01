package day11.task2.models;

public class Warrior extends Hero {

    public Warrior() {
        physAtk = 30;
        physDef = 0.8;

    }


    @Override
    public String toString() {
        return "Warrior{" +
                "Health=" + health +
                '}';
    }
}
