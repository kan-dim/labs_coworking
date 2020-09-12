package manager;

import service.checkInput;

import java.util.Scanner;

public class Manager {
    private final String name;
    private final boolean knowEnglish;

    public Manager() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\tВведите имя администратора");
        this.name = scanner.nextLine();

        System.out.println("\n\tЗнает английский? Да - 1, Нет - 0 :");
        int english = checkInput.getNumber(1);

        this.knowEnglish = (english == 1);

        System.out.println("*** Администратор добавлен ***");
    }

    public Manager(String name, boolean knowEnglish) {
        this.name = name;
        this.knowEnglish = knowEnglish;

        ManagerService.addManager(this);
    }

    public String getName() {
        return name;
    }

    public boolean isKnowEnglish() {
        return knowEnglish;
    }

    @Override

    public String toString() {
        return ("\n\tИмя: " + name +
                "\n\tАнглийский знает?: " + (knowEnglish ? "Да" : "Нет") + "\n");
    }
}
