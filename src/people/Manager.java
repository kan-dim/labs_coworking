package people;

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
}
