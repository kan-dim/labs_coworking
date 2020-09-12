package excursion;

import client.Client;

import java.util.ArrayList;

public class GuideService {
    private static final ArrayList<Guide> guidesList = new ArrayList<>();

    public static void addGuide(Guide guide) {
        guidesList.add(guide);
        System.out.println("Экскурсовод добавлен в базу");
    }

    public static void removeGuideById(int id) {
        for (Guide guide : guidesList) {

            if (guide.getId() == id) {
                guidesList.remove(guide);
                System.out.println("Клиент удален");

                return;
            }
        }
    }

    public static Guide getGuideById(int id) {
        for (Guide guide : guidesList) {

            if (guide.getId() == id) {
                return guide;
            }
        }

        return null;
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

}
