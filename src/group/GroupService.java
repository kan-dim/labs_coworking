package group;

import excursion.Excursion;
import excursion.ExcursionService;
import manager.Manager;
import manager.ManagerService;
import service.checkInput;

import java.util.ArrayList;
import java.util.Scanner;

public class GroupService {
    private static final ArrayList<Group> groupsList = new ArrayList<>();

    public void addGroup(Group group) {
        groupsList.add(group);
    }

    public void printAllGroups() {
        for (int i = 0; i < groupsList.size(); i++) {
            System.out.println(groupsList.get(i));
        }
    }

    public void createGroup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер администратора:");

        int managerId = checkInput.getNumber(ManagerService.getAmount());
        Manager manager = ManagerService.getManagerById(managerId);

        ManagerService.printAllManagers();


        System.out.println("Введите номер экскурсии:");

        int excursionId = checkInput.getNumber(ExcursionService.getAmount());
        Excursion excursion = ExcursionService.getExcursionById(excursionId);

        Group newGroup = new Group(manager, excursion);

        newGroup.addClientsToGroup();

        System.out.println("Группа создана");
    }
}
