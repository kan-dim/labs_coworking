package service;

import client.Client;
import client.ClientType;

import java.util.ArrayList;

public class ClientService {
    private static final ArrayList<Client> clientsList = new ArrayList<>();

    public static void addClient(Client client) {
        clientsList.add(client);
        System.out.println("Клиент добавлен в базу");
    }

    public static void removeClientById(int id) {
        clientsList.remove(id);
    }

    public static Client getClientById(int id) {
        return clientsList.get(id);
    }


    public static Client getClientByName(String name) {
        for (Client client : clientsList) {

            if (client.getName().equals(name)) {
                return client;
            }
        }
        return null;
    }

    public static int getAmount() {
        return clientsList.size();
    }

    public static void printAllClients() {
        for (int i = 0; i < clientsList.size(); i++) {
            System.out.println("Номер клиента - " + i + ". " + clientsList.get(i));
        }
    }

}
