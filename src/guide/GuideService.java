package guide;

import java.util.ArrayList;

public class GuideService {
    private final ArrayList<Guide> guidesList;

    public GuideService() {
        guidesList = new ArrayList<>();
    }


    public void addGuide(Guide guide) {
        guidesList.add(guide);
    }

    public void removeGuideById(int id) {
        guidesList.remove(id);
    }

    public Guide getGuideById(int id) {
        return guidesList.get(id);
    }


    public Guide getClientByName(String name) {
        for (Guide guide : guidesList) {

            if (guide.getName().equals(name)) {
                return guide;
            }
        }
        return null;
    }

    public int getAmount() {
        return guidesList.size();
    }

    public  Guide getFirstFreeGuide() {
        for (Guide guide : guidesList) {

            if (guide.isFree()) {
                guide.toggleFreeState();

                return guide;

            }
        }

        return null;
    }

    public void printAllGuides() {
        if (guidesList.size() == 0) {
            System.out.println("\nСписок экскурсоводов пуст");
            return;
        }

        for (int i = 0; i < guidesList.size(); i++) {
            System.out.println("Номер экскурсовода - " + i + ". " + guidesList.get(i));
        }
    }
}
