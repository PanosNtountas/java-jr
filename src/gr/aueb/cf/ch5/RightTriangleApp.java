package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβανει 3 τιμες double απο τον χρηστη, τις a, b, c οπου a ειναι η υποτεινουσα και b, c οι δύο πλευρες.
 *
 * Ελεγχει αν το τριγωνο ειναι ορθογωνιο, δλδ a^2 == b^2 + c^2
 *
 * Εστω EPSILON = 0.000005 (εξι σημαντικα ψηφια)
 */

public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Δωσε το μηκος της υποτεινουσας (a) και των δυο πλευρων b και c:");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a*a - b*b - c*c) <= EPSILON) {
            System.out.println("Ορθογώνιο");
        } else {
            System.out.println("Μη ορθογωνιο");
        }

    }
}
