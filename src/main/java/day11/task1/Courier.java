package day11.task1;

public class Courier implements  Worker{
    private double salary;
    private boolean isPayed;
    private final Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public double getSlary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {

        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);

    }

    @Override
    public void bonus() {

        if(warehouse.getCountDeliveredOrders() < 10000){
            System.out.println("Бонус пока не доступен");
            return;
        }
        if(isPayed == true){
            System.out.println("Бонус уже выплачен");
            return;
        }
        salary += 50_000;
        isPayed = true;


    }
}
