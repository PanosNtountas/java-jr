package gr.aueb.cf.ch4;

/**
 * Εκτυπωνει 10,9,8,7,...,2,1 αστερακια σε καθε γραμμη ξεκινωντας απο την 1η γραμμη.
 */

public class Stars10Desc {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10 - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
