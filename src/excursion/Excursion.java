package excursion;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Excursion {

    private final Date date;

    private final int duration;
    private final int visitors;

    private final int id;
    private static int amount = 0;

    private final Guide guide;

    public Excursion(int duration, int visitors) {


        this.date = new Date();
        this.duration = duration;
        this.visitors = visitors;

        guide = GuideService.getFirstFreeGuide();

        this.id = amount;
        amount++;

        ExcursionService.addExcursion(this);
    }

    public Excursion(int day, int month, int year, int duration, int visitors) {

        Calendar calendar = new GregorianCalendar(year, month - 1, day);
        this.date = calendar.getTime();

        this.duration = duration;
        this.visitors = visitors;

        guide = GuideService.getFirstFreeGuide();

        this.id = amount;
        amount++;

        ExcursionService.addExcursion(this);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return ("\nНомер экскурсии: " + id + "\nДлительность: " + duration +
                "\nКоличество посетителей: " + visitors +
                "\nДата проведения: " + date +
                "Экскурсовод: " + guide);
    }
}
