package manager;

import java.util.ArrayList;

public class ManagerService {
    private static final ArrayList<Manager> managersList = new ArrayList<>();

    public static void addManager(Manager manager) {
        managersList.add(manager);
        System.out.println("Администратор добавлен в базу");
    }

    public static void removeManagerById(int id) {
        managersList.remove(id);
    }

    public static Manager getManagerById(int id) {
        return managersList.get(id);
    }


    public static Manager getManagerByName(String name) {
        for (Manager manager : managersList) {

            if (manager.getName().equals(name)) {
                return manager;
            }
        }
        return null;
    }

    public static void printAllManagers() {
        for (int i = 0; i < managersList.size(); i++) {
            System.out.println("Номер администратора - " + i + ". " + managersList.get(i));
        }
    }

    public static int getAmount() {
        return managersList.size();
    }

}
