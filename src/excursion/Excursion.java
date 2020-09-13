package excursion;

import guide.Guide;
import guide.GuideService;
import validateData.checkInput;

import java.util.*;

public class Excursion {

    private final Date date;

    private final int duration;
    private final int visitors;

    private final String id;

    private final Guide guide;


    public Excursion(ExcursionService ExcursionService, GuideService GuideService) {
        this.date = new Date();

        System.out.println("\n\tВведите длительность экскурсии: ");
        this.duration = checkInput.getNumber(180);

        System.out.println("\n\tВведите количество клиентов: ");
        this.visitors = checkInput.getNumber(20);

        System.out.println(" Назначен первый свободный экскурсовод ");
        this.guide = GuideService.getFirstFreeGuide();

        this.id = UUID.randomUUID().toString();

        ExcursionService.addExcursion(this);

        System.out.println("*** Экскурсия создана ***");
    }

    public Excursion(int day, int duration, int visitors, ExcursionService ExcursionService, GuideService GuideService) {

        Calendar calendar = new GregorianCalendar(2020, 8, day);
        this.date = calendar.getTime();

        this.duration = duration;
        this.visitors = visitors;

        guide = GuideService.getFirstFreeGuide();

        this.id = UUID.randomUUID().toString();

        ExcursionService.addExcursion(this);
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return ("\t\nИдентификатор экскурсии: " + id + "\n\tДлительность: " + duration +
                "\n\tКоличество посетителей: " + visitors +
                "\n\tДата проведения: " + date +
                "\n\t\tЭкскурсовод: " + guide + "\n");
    }
}
