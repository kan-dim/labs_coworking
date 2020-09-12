package excursion;

public class Guide {
    private final String name;
    private final boolean knowEnglish;
    private boolean isFree;

    private final int id;
    private static int amount = 0;

    public Guide(String name, boolean knowEnglish) {

        this.name = name;
        this.knowEnglish = knowEnglish;
        this.isFree = true;

        this.id = amount;
        amount++;

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

    public int getId() {
        return id;
    }

    public boolean isFree() {
        return isFree;
    }

    @Override
    public String toString() {
        return ("\nИмя экскурсовода: " + name +
                "\nАнглийский знает?: " + (knowEnglish ? "Да" : "Нет"));
    }
}
