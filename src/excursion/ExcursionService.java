package excursion;

import client.Client;

import java.util.ArrayList;

public class ExcursionService {
    private static final ArrayList<Excursion> excursionsList = new ArrayList<>();

    public static void addExcursion(Excursion excursion) {
        excursionsList.add(excursion);
//        System.out.println("Экскурсия добавлена в базу");
    }

    public static void removeExcursionById(int id) {
        excursionsList.remove(id);
    }

    public static Excursion getExcursionById(int id) {
        return excursionsList.get(id);
    }

    public static void printAllExcursion() {

        if (excursionsList.size() == 0) {
            System.out.println("\nСписок экскурсий пуст");
            return;
        }

        for (int i = 0; i < excursionsList.size(); i++) {
            System.out.println("Номер экскурсии - " + i + ". " + excursionsList.get(i));
        }
    }

    public static int getAmount() {
        return excursionsList.size();
    }
}
