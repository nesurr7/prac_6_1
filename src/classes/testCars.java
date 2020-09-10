package classes;

public class testCars {
    public static void main(String[] argc) {
        Truck truck = new Truck(16, "Синий", 600, 2500);
        truck.startMsg();
        truck.loadTruck(2501);
        truck.startMsg();
        /////////
        TruckCrane craneTruck = new TruckCrane(20, "Зеленый",
                650, 3, 40, true);
        craneTruck.liftCrane();
        craneTruck.startMsg();
        craneTruck.setCraneAtGround(true);
        craneTruck.startMsg();
    }
}
