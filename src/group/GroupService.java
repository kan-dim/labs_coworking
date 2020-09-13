package group;

import client.ClientService;
import excursion.Excursion;
import excursion.ExcursionService;
import manager.Manager;
import manager.ManagerService;
import validateData.checkInput;

import java.util.ArrayList;

public class GroupService {
    private final ArrayList<Group> groupsList;

    public GroupService() {
        groupsList = new ArrayList<>();
    }


    public void addGroup(Group group) {
        groupsList.add(group);
    }

    public void printAllGroups() {

        if (groupsList.size() == 0) {
            System.out.println("Список групп пуст");
            return;
        }

        for (Group group : groupsList) {
            System.out.println(group);
        }
    }

    public void createGroup(ExcursionService ExcursionService, ManagerService ManagerService, ClientService ClientService) {

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

        newGroup.addClientsToGroup(ClientService);

        System.out.println("*** Группа создана ***");

        groupsList.add(newGroup);
    }

    public int getAmount() {
        return groupsList.size();
    }

    public void removeGroupById(int id) {
        groupsList.remove(id);
    }
}
