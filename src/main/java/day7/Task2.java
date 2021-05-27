package day7;


import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
       FootballGame fg = new FootballGame();

        for (int i = 0; i < 6; i++) {
            fg.init(new Player(rand.nextInt(11) + 90));
        }

        fg.init(new Player(rand.nextInt(11) + 90));

        fg.info();

        fg.play(0);
        fg.info();

        fg.play(1);
        fg.info();

        fg.play(2);
        fg.info();

        fg.play(3);
        fg.info();

        fg.play(4);
        fg.info();

        fg.play(5);
        fg.info();



        }

}
