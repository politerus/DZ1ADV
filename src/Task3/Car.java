package Task3;

public class Car implements Comparable {
    int speed;
    int price;
    String model;
    String color;

    Car(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене
    public int compareTo(Object o) {
        int temp = this.speed - ((Car) o).speed;
        if (temp == 0) {
            temp = this.price - ((Car) o).price;
        } else return temp;
        if (temp == 0) {
            temp = this.model.compareTo(((Car) o).model);
        } else return temp;
        if (temp == 0) {
            temp = this.color.compareTo(((Car) o).color);
        } else return temp;
        return temp;
    }
}