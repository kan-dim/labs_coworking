package guide;

import validateData.checkInput;

import java.util.Scanner;
import java.util.UUID;

public class Guide {
    private final String name;
    private final boolean knowEnglish;
    private boolean isFree;

    private final String id;

    public Guide(GuideService GuideService) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\tВведите имя экскурсовода: ");
        this.name = scanner.nextLine();

        System.out.println("\n\tЗнает английский? Да - 1, Нет - 0 :");
        int english = checkInput.getNumber(1);

        this.knowEnglish = (english == 1);
        this.isFree = true;

        this.id = UUID.randomUUID().toString();

        GuideService.addGuide(this);

        System.out.println("*** Экскурсовод добавлен ***");
    }

    public Guide(String name, boolean knowEnglish, GuideService GuideService) {

        this.name = name;
        this.knowEnglish = knowEnglish;
        this.isFree = true;

        this.id = UUID.randomUUID().toString();
        GuideService.addGuide(this);
    }

    public String getName() {
        return name;
    }

    public void toggleFreeState() {
        isFree = !this.isFree;
    }

    public String getId() {
        return id;
    }

    public boolean isFree() {
        return isFree;
    }

    @Override
    public String toString() {
        return ("\n\tИмя: " + name +
                "\n\tАнглийский знает?: " + (knowEnglish ? "Да" : "Нет") + "\n");
    }
}
