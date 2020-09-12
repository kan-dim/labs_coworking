package com.company;

import client.Client;
import client.ClientService;

import excursion.Excursion;
import excursion.ExcursionService;

import group.GroupService;

import guide.Guide;
import guide.GuideService;

import manager.Manager;
import manager.ManagerService;

import room.Room;
import validateData.checkInput;

public class Menu {
    public static int printMenu() {

        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-");

        System.out.println("1. Информация о компании");

        System.out.println("2. Добавить клиента");
        System.out.println("3. Удалить клиента");
        System.out.println("4. Список клиентов");

        System.out.println("5. Добавить менеджера");
        System.out.println("6. Удалить менеджера");
        System.out.println("7. Список менеджеров");

        System.out.println("8. Добавить экскурсовода");
        System.out.println("9. Удалить экскурсовода");
        System.out.println("10. Список экскурсоводов");

        System.out.println("11. Добавить экскурсию");
        System.out.println("12. Удалить экскурсию");
        System.out.println("13. Список экскурсий");

        System.out.println("14. Добавить группу");
        System.out.println("15. Удалить группу");
        System.out.println("16. Список групп");

        System.out.println("17. Завершить");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-");

        System.out.println("Что будем делать?");
        return checkInput.getNumber(18);
    }

    public static void doUserChoice(Room room) {

        int userChoice = -1;

        while (userChoice < 17) {

            userChoice = printMenu();

            switch (userChoice) {

                case 1:
                    System.out.println(room);
                    break;

                case 2:
                    new Client();
                    break;

                case 3:
                    System.out.println("Введите номер клиента, которого желаете удалить:");
                    int clientId = checkInput.getNumber(ClientService.getAmount());
                    ClientService.removeClientById(clientId);
                    break;

                case 4:
                    ClientService.printAllClients();
                    break;


                case 5:
                    new Manager();
                    break;

                case 6:
                    System.out.println("Введите номер менеджера, которого желаете удалить:");
                    int managerID = checkInput.getNumber(ManagerService.getAmount());
                    ManagerService.removeManagerById(managerID);
                    break;

                case 7:
                    ManagerService.printAllManagers();
                    break;

                case 8:
                    new Guide();
                    break;

                case 9:
                    System.out.println("Введите номер экскурсовода, которого желаете удалить:");
                    int guidID = checkInput.getNumber(GuideService.getAmount());
                    GuideService.removeGuideById(guidID);
                    break;

                case 10:
                    GuideService.printAllGuides();
                    break;

                case 11:
                    new Excursion();
                    break;

                case 12:
                    System.out.println("Введите номер экскурсии, которою хотите удалить:");
                    int excursionID = checkInput.getNumber(ExcursionService.getAmount());
                    ExcursionService.removeExcursionById(excursionID);
                    break;

                case 13:
                    ExcursionService.printAllExcursion();
                    break;

                case 14:
                    GroupService.createGroup();
                    break;

                case 15:
                    System.out.println("Введите номер группы, которою хотите удалить:");
                    int groupID = checkInput.getNumber(GroupService.getAmount());
                    GroupService.removeGroupById(groupID);
                    break;

                case 16:
                    GroupService.printAllGroups();
                    break;

                default:
                    break;
            }
        }
    }
}