package group;

import excursion.Excursion;
import excursion.ExcursionService;
import manager.Manager;
import client.ClientService;
import manager.ManagerService;
import service.checkInput;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Group {

    private Manager manager;
    private Excursion excursion;

    private ArrayList<Integer> clientsIdList;

    public Group(Manager manager, Excursion excursion) {

        this.manager = manager;
        this.excursion = excursion;

    }

    public void addClientsToGroup() {
        clientsIdList = new ArrayList<>();
        int max = ClientService.getAmount();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Вот список клиентов:");
        ClientService.printAllClients();

        System.out.println("В одну строку введите номера клиентов, которых хотите добавить в группу.\n" +
                "Все некорректные данные будут пропущены.");

        String setOfClients = scanner.nextLine();

        String pattern = "\\b(\\d+)\\b";

        Pattern regex = Pattern.compile(pattern);

        Matcher mathces = regex.matcher(setOfClients);

        while (mathces.find()) {
            int id = Integer.parseInt(mathces.group());
            if (id >= 0 && id < max) {
                clientsIdList.add(id);
            }
        }

        System.out.println("*** Клиенты добавлены ***");

    }

    public String getAllClientsForGroup() {
        String clients = "";
        for (int i = 0; i < clientsIdList.size(); i++) {
            clients += ClientService.getClientById(i).toString();
        }
        return clients;
    }

    @Override

    public String toString() {
        return ("\nМенеджер: " + manager +
                "\n Экскурсия: " + excursion +
                "\n Клиенты: " + getAllClientsForGroup());
    }


}
