package excursion;

import guide.Guide;
import guide.GuideService;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

public class Excursion {

    private final Date date;

    private final int duration;
    private final int visitors;

    private final String id;

    private final Guide guide;

    public Excursion(int duration, int visitors) {


        this.date = new Date();
        this.duration = duration;
        this.visitors = visitors;

        guide = GuideService.getFirstFreeGuide();

        this.id = UUID.randomUUID().toString();

        ExcursionService.addExcursion(this);
    }

    public Excursion(int day, int month, int year, int duration, int visitors) {

        Calendar calendar = new GregorianCalendar(year, month - 1, day);
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
