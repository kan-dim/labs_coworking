import client.Client;
import client.ClientService;
import client.ClientType;
import client.Language;
import menu.Menu;
import excursion.Excursion;
import excursion.ExcursionService;
import group.GroupService;
import guide.Guide;
import guide.GuideService;
import manager.Manager;
import manager.ManagerService;
import room.Room;

public class Main {

    public static void main(String[] args) {

        GroupService GroupService = new GroupService();
        ManagerService ManagerService = new ManagerService();
        GuideService GuideService = new GuideService();
        ExcursionService ExcursionService = new ExcursionService();
        ClientService ClientService = new ClientService();


        Main.createClients(ClientService);
        Main.createGuides(GuideService);
        Main.createManagers(ManagerService);
        Main.createExcursions(ExcursionService, GuideService);

        Room room = new Room("KanDim Coworking", "Хрещатик 10", 500, 8, 20, 35);

        Menu Menu = new Menu();

        Menu.createMenu(room, ClientService, ManagerService, GuideService, ExcursionService, GroupService);

    }


    public static void createClients(ClientService ClientService) {
        new Client("Андрей", ClientType.COMPANY, Language.ENGLISH, ClientService);
        new Client("Наваско", ClientType.FREELANCER, Language.PORTUGUESE, ClientService);
        new Client("Аргунтин", ClientType.FREELANCER, Language.SPANISH, ClientService);
        new Client("Александр", ClientType.FREELANCER, Language.RUSSIAN, ClientService);
    }


    public static void createGuides(GuideService GuideService) {
        new Guide("Екатерина Петровна", true, GuideService);
        new Guide("Василий Грызунов", false, GuideService);
        new Guide("Василия Волкова", false, GuideService);
        new Guide("Анастасия Кучугурова", true, GuideService);
    }


    public static void createManagers(ManagerService ManagerService) {
        new Manager("Руслан", true, ManagerService);
        new Manager("Евгений", false, ManagerService);
    }

    public static void createExcursions(ExcursionService ExcursionService, GuideService GuideService) {
        new Excursion(1, 150, 15, ExcursionService, GuideService);
        new Excursion(1, 65, 13, ExcursionService, GuideService);
    }
}

