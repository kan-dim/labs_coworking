package manager;

import java.util.ArrayList;

public class ManagerService {
    private final ArrayList<Manager> managersList;

    public ManagerService() {
        managersList = new ArrayList<>();
    }

    public void addManager(Manager manager) {
        managersList.add(manager);
    }

    public void removeManagerById(int id) {
        managersList.remove(id);
    }

    public Manager getManagerById(int id) {
        return managersList.get(id);
    }


    public Manager getManagerByName(String name) {
        for (Manager manager : managersList) {

            if (manager.getName().equals(name)) {
                return manager;
            }
        }
        return null;
    }

    public void printAllManagers() {
        if (managersList.size() == 0) {
            System.out.println("\nСписок менеджеров пуст");
            return;
        }

        for (int i = 0; i < managersList.size(); i++) {
            System.out.println("Номер администратора - " + i + ". " + managersList.get(i));
        }
    }

    public int getAmount() {
        return managersList.size();
    }

}
