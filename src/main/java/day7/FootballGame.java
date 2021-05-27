package day7;

import java.util.ArrayList;
import java.util.List;

public class FootballGame {
    private static int countPlayers = 0;
    private List<Player> players = new ArrayList<>();

    public void init(Player player){
        if(countPlayers == 6) {
            System.out.println("Нельзя добавить игрока - команды полные");
            return;
        }
        players.add(player);
        countPlayers++;
    }

    public void play(int id){
        try {
            if(players.get(id).getStamina() == 0){
                System.out.println("Игрок на перерыве");
                return;
            }
            while(players.get(id).getStamina() != 0){
                players.get(id).run();
            }
            countPlayers--;
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Такого игрока не существует!");
        }

    }

    public void info(){
        if(countPlayers == 6)
            System.out.println("На поле нет свободных мест");

        else
            if(countPlayers == 5)
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободное место");

            else if(countPlayers < 5 && countPlayers > 1)
                System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных места");

            else
                 System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");



    }

}
