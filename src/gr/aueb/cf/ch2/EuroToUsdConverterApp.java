package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει euros σε δολαρια ΗΠΑ
 * Λαμβανει απο το χρηστη (stdin) ενα ακεραιο
 * που συμβολιζει το ποσο σε euros, μετατρεπει σε
 * δολαρια και εμφανιζει το τελικο αποτελεσμα.
 */

public class EuroToUsdConverterApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        System.out.println("Please insert an amount (in Euros): ");
        inputEuros = in.nextInt();

        totalUsaCents = PARITY * inputEuros;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d Euros = %d USA dollars, %d USA cents", inputEuros, usaDollars, usaCents);
    }
}
