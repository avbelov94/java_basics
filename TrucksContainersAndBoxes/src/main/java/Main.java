import java.util.Scanner;

public class Main {

    public static final int BOXES_IN_CONTAINERS_COUNT = 27;
    public static final int CONTAINERS_IN_TRUCKS_COUNT = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boxes = scanner.nextLine();

        // Задача: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // грузовик => 12 контейнеров
        // контейнер => 27 ящиков

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */

        int boxesInt = Integer.parseInt(boxes);
        int boxesInContainer = 0;
        int container = 0;
        int truck = 0;
        if (boxesInt == 0) {
            System.out.println("Необходимо:" + "\n" + "грузовиков - " + 0
                    + " шт." + "\n" + "контейнеров - " + 0 + " шт.");
        }
        for (int i = 0; i < boxesInt; i++) {
            if (container % CONTAINERS_IN_TRUCKS_COUNT == 0
                    && boxesInContainer % BOXES_IN_CONTAINERS_COUNT == 0) {
                System.out.println("Грузовик: " + ++truck);
            }
            if (boxesInContainer % BOXES_IN_CONTAINERS_COUNT == 0) {
                System.out.println("\t" + "Контейнер: " + ++container);
            }
            System.out.println("\t" + "\t" + "Ящик: " + ++boxesInContainer);
        }
        if (boxesInt > 0) {
            System.out.println("Необходимо:" + "\n" + "грузовиков - " + truck
                    + " шт." + "\n" + "контейнеров - " + container + " шт.");
        }
    }
}
