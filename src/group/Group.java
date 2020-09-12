package group;

import excursion.Excursion;
import manager.Manager;
import service.ClientService;

import java.util.ArrayList;
import java.util.Scanner;
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
    }

    public String getAllClientsForGroup() {
        String clients = null;
        for (int i = 0; i < clientsIdList.size(); i++) {
            clients += clientsIdList.get(i).toString();
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
