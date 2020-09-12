package group;

import excursion.Excursion;
import excursion.ExcursionService;
import manager.Manager;
import manager.ManagerService;
import service.checkInput;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;

public class GroupService {
    private static final ArrayList<Group> groupsList = new ArrayList<>();

    public static void addGroup(Group group) {
        groupsList.add(group);
    }

    public static void printAllGroups() {

        if (groupsList.size() == 0) {
            System.out.println("Список групп пуст");
            return;
        }

        for (int i = 0; i < groupsList.size(); i++) {
            System.out.println(groupsList.get(i));
        }
    }

    public static void createGroup() {
        Scanner scanner = new Scanner(System.in);
        ManagerService.printAllManagers();
        System.out.println("Введите номер администратора:");

        int managerId = checkInput.getNumber(ManagerService.getAmount());
        Manager manager = ManagerService.getManagerById(managerId);

        ManagerService.printAllManagers();


        ExcursionService.printAllExcursion();
        System.out.println("Введите номер экскурсии:");
        int excursionId = checkInput.getNumber(ExcursionService.getAmount());
        Excursion excursion = ExcursionService.getExcursionById(excursionId);

        Group newGroup = new Group(manager, excursion);

        newGroup.addClientsToGroup();

        System.out.println("*** Группа создана ***");

        GroupService.addGroup(newGroup);
    }

    public static int getAmount() {
        return groupsList.size();
    }

    public static void removeGroupById(int id) {
        groupsList.remove(id);
    }
}
