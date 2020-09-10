package classes;

public class Truck extends Car {
    private int capacity;

    Truck(){
        capacity=-1;
    };

    Truck(int size, String color, int hp, int capacity) {
        this.size = size;
        this.color = color;
        this.capacity = capacity;
        this.hp = hp;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void loadTruck(int kg) {
        if (kg < capacity) {
            capacity -= kg;
            System.out.println("Загрузка " + kg + "-кг успешна");
        } else {
            System.out.println("Вы загрузили: " + (capacity) + " из " + kg + " возможных");
            System.out.println("Вам необходимо освободить место в грузовике");
            capacity = 0;
        }
    }

    public void unloadTruck(int kg) {
        if (capacity < kg) {
            capacity = 0;
            System.out.println("Грузовик теперь пуст");
        } else {
            capacity -= kg;
            System.out.println("Разгрузка \n" + kg + "-кг успешна");
        }
    }

    @Override
    public void startMsg() {
        if (capacity < 50) {
            System.out.println("Грузовик не может тронуться с места , вам необходимо сбросить груз");
        } else {
            System.out.println("Вы успешно тронулись с места");
        }
    }
}
