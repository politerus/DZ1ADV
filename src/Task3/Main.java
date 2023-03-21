package Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(190, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "BLUE");
        Car c4 = new Car(185, 10000, "Mercedes", "ASFALT");
        Car c5 = new Car(185, 10000, "Mercedes", "Cream");
        Car[] c = {c3, c4, c5};

        Arrays.sort(c);
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
