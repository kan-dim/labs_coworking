package people;

public enum Language {
    UKRAINIAN("Украинский"),
    RUSSIAN("Русский"),
    ENGLISH("Английский"),
    SPANISH("Испанский"),
    PORTUGUESE("Португальский");

    private final String language;

    Language(String language) {
        this.language = language;
    }

    public static int getAmount() {
        return Language.values().length;
    }

    public static void printAllLanguages() {
        Language[] languages = Language.values();
        int id = 0;
        for (Language language : languages) {
            System.out.println(id + ". " + language.toString());
            id++;
        }
    }

    public static Language getLanguageById(int id) {
        return switch (id) {
            case 1 -> Language.RUSSIAN;
            case 2 -> Language.ENGLISH;
            case 3 -> Language.SPANISH;
            case 4 -> Language.PORTUGUESE;
            default -> Language.UKRAINIAN;
        };
    }

    @Override
    public String toString() {
        return language;
    }
}
