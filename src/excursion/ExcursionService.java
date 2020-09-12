package excursion;

import client.Client;

import java.util.ArrayList;

public class ExcursionService {
    private static final ArrayList<Excursion> excursionsList = new ArrayList<>();

    public static void addExcursion(Excursion excursion) {
        excursionsList.add(excursion);
        System.out.println("Экскурсия добавлена в базу");
    }

    public static void removeExcursionById(int id) {
        for (Excursion excursion : excursionsList) {

            if (excursion.getId() == id) {
                excursionsList.remove(excursion);
                System.out.println("Экскурсия удалена");

                return;
            }
        }
    }

    public static Excursion getExcursionById(int id) {
        for (Excursion excursion : excursionsList) {

            if (excursion.getId() == id) {
                return excursion;
            }
        }

        return null;
    }


}
