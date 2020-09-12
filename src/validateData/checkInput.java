package validateData;

import java.util.Scanner;

public class checkInput {

    public static int getNumber(int max) {

        Scanner scanner = new Scanner(System.in);

        int id;

        while (true) {

            if (!scanner.hasNextInt()) {
                System.out.println("\tВведите число");
                scanner.next();
                continue;
            }

            id = scanner.nextInt();

            if (id < 0 || id >= max) {
                System.out.println("\tДоступный диапазон от 0 до " +
                        (max - 1) + ". Попробуйте еще раз.");
            } else {
                break;
            }
        }

        return id;
    }
}