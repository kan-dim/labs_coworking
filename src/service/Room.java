package service;

public class Room {
    private final String name;
    private final String address;

    private int startWorking;
    private int finishWorking;

    private int pricePerOneHour;

    private int amountOfVisitors;


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

    public void setStartWorking(int startWorking) {
        this.startWorking = startWorking;
    }

    public void setFinishWorking(int finishWorking) {
        this.finishWorking = finishWorking;
    }

    public void setAmountOfVisitors(int amountOfVisitors) {
        this.amountOfVisitors = amountOfVisitors;
    }

    public void setPricePerOneHour(int pricePerOneHour) {
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

