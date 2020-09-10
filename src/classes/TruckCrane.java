package classes;

public class TruckCrane extends Car {
    private int craneHeight;
    private int craneCapacity;
    private boolean craneAtGround;

    TruckCrane() {
    }

    TruckCrane(int size, String color, int hp, int craneCapacity, int craneHeight, boolean craneAtGround) {
        this.craneCapacity = craneCapacity;
        this.craneHeight = craneHeight;
        this.size = size;
        this.hp = hp;
        this.color = color;
        this.craneAtGround = craneAtGround;
    }

    public void setCraneCapacity(int craneCapacity) {
        this.craneCapacity = craneCapacity;
    }

    public void setCraneHeight(int craneHeight) {
        this.craneHeight = craneHeight;
    }

    public void setCraneAtGround(boolean craneAtGround) {
        this.craneAtGround = craneAtGround;
    }

    public boolean getCraneAtGround() {
        return craneAtGround;
    }

    public int getCraneCapacity() {
        return craneCapacity;
    }

    public int getCraneHeight() {
        return craneHeight;
    }

    public void liftCrane() {
        System.out.println("Машина поднимает кран с " +
                craneCapacity + " членами бригады на высоту:" + craneHeight);
        craneAtGround = false;
    }

    @Override
    public void startMsg() {
        if (!craneAtGround) {
            System.out.println("Кран не опущен, машина не может тронуться с места");
        } else {
            System.out.println("Кран опущен, машина может тронуться с места");
        }
    }
}
