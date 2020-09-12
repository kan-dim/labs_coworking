package manager;

public class Manager {
    private final String name;
    private final boolean knowEnglish;

    public Manager(String name, boolean knowEnglish) {
        this.name = name;
        this.knowEnglish = knowEnglish;
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
                "\n\tАнглийский знает?: " + (knowEnglish ? "Да" : "Нет\n"));
    }
}
