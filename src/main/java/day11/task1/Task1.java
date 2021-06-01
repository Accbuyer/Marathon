package day11.task1;

public class Task1 {
    static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i++) {

        worker.doWork();

        }
        worker.bonus();

    }
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        businessProcess(picker);
        businessProcess(courier);

        System.out.println("Задача 1");

        System.out.println(warehouse);
        System.out.println(picker);
        System.out.println(courier);

        Warehouse warehouse1 = new Warehouse();

        Picker picker1 = new Picker(warehouse1);
        Courier courier1 = new Courier(warehouse1);

        businessProcess(picker1);
        businessProcess(courier1);

        System.out.println("Задача 2");

        System.out.println(warehouse1);
        System.out.println(picker1);
        System.out.println(courier1);

        System.out.println();
        System.out.println(warehouse);
        System.out.println(picker);
        System.out.println(courier);
    }

}
