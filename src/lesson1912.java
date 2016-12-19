import com.sun.org.apache.xpath.internal.SourceTree;

public class lesson1912 {
    public static class Car {
        public String color;
        public int price;
        public int length;

    }

    public static void showCar(int number, Car car) {
        System.out.println("Car № " + number);
        System.out.println("color: " + car.color);
        System.out.println("price: " + car.price);
        System.out.println("length: " + car.length);
        System.out.println();
    }

    public static Car[] sortByPrice(Car[] cars) {
        for (int i = 0; i < cars.length; i++)
            for (int j = 0; j < cars.length - 1; j++)
                if (cars[j].price > cars[j + 1].price) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;

                }
        return cars;
    }
    public static Car[] sortByLength(Car[] cars) {
        for (int i = 0; i < cars.length; i++)
            for (int j = 0; j < cars.length - 1; j++)
                if (cars[j].length > cars[j + 1].length) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;

                }
        return cars;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "red";
        c1.price = 15000;
        c1.length = 5;

        Car c2 = new Car();
        c2.color = "blue";
        c2.price = 20000;
        c2.length = 4;


        Car c3 = new Car();
        c3.color = "black";
        c3.price = 8000;
        c3.length = 3;
        showCar(1, c1);
        showCar(2, c2);
        showCar(3, c3);

        Car[] garage = new Car[3];
        garage[0] = c1;
        garage[1] = c2;
        garage[2] = c3;

        for (int i = 0; i < garage.length; i++)
            showCar(i + 1, garage[i]);

        garage = sortByPrice (garage);
        for (int i = 0; i < garage.length; i++)
            showCar (i + 1, garage [i]);

        garage = sortByLength (garage);
        for (int i = 0; i < garage.length; i++)
            showCar (i + 1, garage [i]);

    }
}
