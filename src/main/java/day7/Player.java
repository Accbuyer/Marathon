package day7;

public class Player {
    private int stamina;
    private  final int MAX_STAMINA = 100;
    private  final int MIN_STAMINA = 0;


    public Player(int stamina) {
        this.stamina = stamina;
    }

    public void run(){
        stamina --;
    }

    public int getStamina() {
        return stamina;
    }


}
