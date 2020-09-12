package client;

public enum ClientType {
    FREELANCER("Фрилансер"),
    COMPANY("Представитель компании");

    private final String clientType;

    ClientType(String clientType) {
        this.clientType = clientType;
    }

    public static int getAmount() {
        return ClientType.values().length;
    }

    public static void printAllTypes() {
        ClientType[] clientTypes = ClientType.values();
        int id = 0;
        for (ClientType clientType : clientTypes) {
            System.out.println(id + ". " + clientType);
            id++;
        }
    }

    public static ClientType getLanguageById(int id) {
        return switch (id) {
            case 1 -> ClientType.COMPANY;
            default -> ClientType.FREELANCER;
        };
    }

    @Override
    public String toString() {
        return clientType;
    }
}
