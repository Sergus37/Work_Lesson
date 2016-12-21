
public class lesson2112 {

    public static class OurGroupStudent {
       static int number; // общее, характерное для всех объектов этого класса
        int age;
        String fio;

    }

    public static void main(String[] args) {
        OurGroupStudent s1  = new OurGroupStudent();
        s1.fio = "A";
        s1.age = 1;
        s1.number = 1122;
        OurGroupStudent s2  = new OurGroupStudent();
        s2.fio = "B";
        s2.age = 2;
        s2.number = 1122;
        OurGroupStudent s3  = new OurGroupStudent();
        s3.fio = "D";
        s3.age = 3;
        s3.number = 1122;

        System.out.println(s1.number);
        s1.number = 3377;
        System.out.println(s2.number);

        System.out.println(OurGroupStudent.number);

    }

    enum Color {
        RED,
        WHITE,
        GREEN,
        BLACK,
        BLUE,
        PURPLE

    }

    enum MatrixType {
        IPS,
        TFT,
        TN,
        AMOLED
    }

    public static void main1(String[] args) {
        Color c1 = Color.BLUE;

        if (c1 == Color.BLUE) {
            System.out.println("go");
        }

        Color c2 = Color.RED;
        // Color - тип данных перечесления
        // c2 - пееменная этого типа данных
        // Color.RED - одно из значения взятое из перечисления

        switch (c2) {
            case BLACK:
                System.out.println("Black");
                break;
            case RED:
                System.out.println("RED");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
            case PURPLE:
                System.out.println("PURPLE");
                break;
        }
    }

    public static class Battery {
        public int maxCapacity;
        public int currentCapacity;

    }
    public  static class Touch {
        public static String Manufacture;
    }

    public static class Display {
        public double d;
        public MatrixType matrix;
        public  Touch touch;
    }

    public static class Phone {
        public Color color;
        public Battery battery;
        public int RAM;
        public Display display;

    }

    public static void main2(String[] args) {
        Phone myPhone = new Phone();
        myPhone.color = Color.WHITE;
        myPhone.battery = new Battery();
        myPhone.battery.maxCapacity = 4000;
        myPhone.battery.currentCapacity = 2500;
        myPhone.display = new Display();
        myPhone.display.d = 5;
        myPhone.display.matrix = MatrixType.AMOLED;
        myPhone.display.touch = new Touch();
        myPhone.display.touch.Manufacture = "???";
        myPhone.RAM = 3036;



    }
}
