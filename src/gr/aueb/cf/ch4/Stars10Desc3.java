package gr.aueb.cf.ch4;
/**
 * Εκτυπωνει 10,9,8,7,...,2,1 αστερακια σε καθε γραμμη ξεκινωντας απο την 1η γραμμη.
 */
public class Stars10Desc3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int j = i; j <= 10; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
