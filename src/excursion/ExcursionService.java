package excursion;

import java.util.ArrayList;

public class ExcursionService {

    public ExcursionService() {
        excursionsList = new ArrayList<>();
    }

    private final ArrayList<Excursion> excursionsList;

    public  void addExcursion(Excursion excursion) {
        excursionsList.add(excursion);
    }

    public  void removeExcursionById(int id) {
        excursionsList.remove(id);
    }

    public  Excursion getExcursionById(int id) {
        return excursionsList.get(id);
    }

    public  void printAllExcursion() {

        if (excursionsList.size() == 0) {
            System.out.println("\nСписок экскурсий пуст");
            return;
        }

        for (int i = 0; i < excursionsList.size(); i++) {
            System.out.println("Номер экскурсии - " + i + ". " + excursionsList.get(i));
        }
    }

    public  int getAmount() {
        return excursionsList.size();
    }
}
