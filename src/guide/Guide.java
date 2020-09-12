package guide;

import java.util.UUID;

public class Guide {
    private final String name;
    private final boolean knowEnglish;
    private boolean isFree;

    private final String id;

    public Guide(String name, boolean knowEnglish) {

        this.name = name;
        this.knowEnglish = knowEnglish;
        this.isFree = true;

        this.id = UUID.randomUUID().toString();

        GuideService.addGuide(this);
    }

    public String getName() {
        return name;
    }

    public boolean isKnowEnglish() {
        return knowEnglish;
    }

    public void toggleFreeState() {
        isFree = !isFree;
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
                "\n\tАнглийский знает?: " + (knowEnglish ? "Да" : "Нет\n"));
    }
}
