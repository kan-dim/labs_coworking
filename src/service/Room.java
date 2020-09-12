package service;

public class Room {
    private final String name;
    private final String address;

    private final int startWorking;
    private final int finishWorking;

    private final int pricePerOneHour;

    private final int amountOfVisitors;


    public Room(String name, String address,
                int amountOfVisitors, int startWorking,
                int finishWorking, int pricePerOneHour) {
        this.name = name;
        this.address = address;
        this.startWorking = startWorking;
        this.finishWorking = finishWorking;
        this.amountOfVisitors = amountOfVisitors;
        this.pricePerOneHour = pricePerOneHour;
    }

    @Override
    public String toString() {
        return ("<<<<<<<<<<<<<<<<<<<<<<" +
                "\nВам приветствует компания - " + name + ". " +
                "\nМы предостовляем услуги коворкинга" +
                "\nНаше время работы с " + startWorking + " до " + finishWorking +
                "\nМаксимальное количество клиентов - " + amountOfVisitors +
                "\nЧас помещения будет стоить - " + pricePerOneHour + "грн" +
                "\n>>>>>>>>>>>>>>>>>>>>>>>"
        );
    }

}

