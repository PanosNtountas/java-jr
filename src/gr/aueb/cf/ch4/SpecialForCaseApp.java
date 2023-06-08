package gr.aueb.cf.ch4;

/**
 * Αεναο for loop
 */

public class SpecialForCaseApp {
    public static void main(String[] args) {
        int counter = 0;

        for (;;) {
            //Το ;; σημαινει για παντα δλδ αντιπροσωπευει το while true
            System.out.print("forever ");
            counter++;
            if (counter % 20 == 0) System.out.println();
            if (counter == 100) break;
        }
    }
}
