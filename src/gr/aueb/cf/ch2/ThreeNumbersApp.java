package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ζηταει απο το χρηστη τρεις ακεραιους, τους μειωνει κατα μια μοναδα
 * και τους εμφανιζει με την ιδια σειρα που δοθηκαν αφηνοντας ενα κενο
 * αναμεσα τους.
 */

public class ThreeNumbersApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert three integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        // num1 = num1 - 1;
        // num1 -= 1;
        num1--;
        num2--;
        num3--;


        System.out.printf("%d %d %d", num1, num2, num3);
    }
}
