package guide;

import java.util.ArrayList;

public class GuideService {
    private static final ArrayList<Guide> guidesList = new ArrayList<>();

    public static void addGuide(Guide guide) {
        guidesList.add(guide);
        System.out.println("Экскурсовод добавлен в базу");
    }

    public static void removeGuideById(int id) {
        guidesList.remove(id);
    }

    public static Guide getGuideById(int id) {
        return guidesList.get(id);
    }


    public static Guide getClientByName(String name) {
        for (Guide guide : guidesList) {

            if (guide.getName().equals(name)) {
                return guide;
            }
        }
        return null;
    }

    public static Guide getFirstFreeGuide() {
        for (Guide guide : guidesList) {

            if (guide.isFree()) {
                guide.toggleFreeState();

                return guide;
            }
        }

        return null;
    }

    public static void printAllGuides() {
        for (int i = 0; i < guidesList.size(); i++) {
            System.out.println("Номер экскурсовода - " + i + ". " + guidesList.get(i));
        }
    }

    public static int getAmount() {
        return guidesList.size();
    }

}
