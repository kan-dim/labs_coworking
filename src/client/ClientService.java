package client;

import java.util.ArrayList;

public class ClientService {
    private  final ArrayList<Client> clientsList;

    public ClientService() {
        clientsList = new ArrayList<>();
    }

    public  void addClient(Client client) {
        clientsList.add(client);
    }

    public  void removeClientById(int id) {
        clientsList.remove(id);
    }

    public  Client getClientById(int id) {
        return clientsList.get(id);
    }

    public  int getAmount() {
        return clientsList.size();
    }

    public  Client getClientByName(String name) {
        for (Client client : clientsList) {

            if (client.getName().equals(name)) {
                return client;
            }
        }
        return null;
    }

    public  void printAllClients() {

        if (clientsList.size() == 0) {
            System.out.println("\nСписок клиентов пуст");
            return;
        }

        for (int i = 0; i < clientsList.size(); i++) {
            System.out.println("Номер клиента - " + i + ". " + clientsList.get(i));
        }
    }
}
