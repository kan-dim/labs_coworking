package service;

import client.Client;

import java.util.ArrayList;

public class ClientService {
    private static final ArrayList<Client> clientsList = new ArrayList<>();

    public static void addClient(Client client) {
        clientsList.add(client);
        System.out.println("Клиент добавлен в базу");
    }

    public static void removeClientById(int id) {
        for (Client client : clientsList) {

            if (client.getId() == id) {
                clientsList.remove(client);
                System.out.println("Клиент удален");

                return;
            }
        }
    }

    public static Client getClientById(int id) {
        for (Client client : clientsList) {

            if (client.getId() == id) {
                return client;
            }
        }

        return null;
    }


    public static Client getClientByName(String name) {
        for (Client client : clientsList) {

            if (client.getName().equals(name)) {
                return client;
            }
        }
        return null;
    }

}
