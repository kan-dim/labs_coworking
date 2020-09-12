package client;

import service.ClientService;
import service.checkInput;

import java.util.Scanner;
import java.util.UUID;

public final class Client {

    private final String name;
    private final ClientType clientType;
    private final Language language;
    private final String id;
    private static int amount = 0;

    public Client() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---Создание клиента---");
        System.out.println("Введите имя: ");
        this.name = scanner.nextLine();

        System.out.println("Выбирите тип клиента: ");
        ClientType.printAllTypes();
        int clientId = checkInput.getNumber(ClientType.getAmount());
        this.clientType = ClientType.getLanguageById(clientId);

        System.out.println("Выбирите язык клиента: ");
        Language.printAllLanguages();
        int languageId = checkInput.getNumber(Language.getAmount());
        this.language = Language.getLanguageById(languageId);


        this.id = UUID.randomUUID().toString();

        ClientService.addClient(this);
    }

    public Client(String name, ClientType clientType, Language language) {

        this.name = name;
        this.clientType = clientType;
        this.language = language;
        this.id = UUID.randomUUID().toString();

        ClientService.addClient(this);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return ("\n\tИмя клиента: " + name + "\n\tТип: " + clientType +
                "\n\tЯзык: " + language + "\n\tID: " + id + "\n");
    }

}
