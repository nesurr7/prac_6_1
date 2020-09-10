package classes;

public abstract class Car {
    protected int size;
    protected String color;
    protected int hp;

    Car() {
        size = -1;
        color = "undefined";
        hp = -1;
    }

    Car(int size, int hp, String color) {
        this.color = color;
        this.hp = hp;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getHp() {
        return hp;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract void startMsg();
}
