
public class lesson2112 {

    enum Color {
        RED,
        WHITE,
        GREEN,
        BLACK,
        BLUE,
        PURPLE

    }

    public static void main(String[] args) {
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

    class Battery {

    }
}
