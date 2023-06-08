package gr.aueb.cf.ch4;

/**
 * Ενας μικρος βατραχος θελει να περασει ενα ποταμι. Ο frog βρισκεται στη θεση Χ και θελει να φτασει
 * στη θεση Υ (ή σε θεση > Υ). Ο frog jumps a fixed distance, D.
 *
 * Βρισκει τον ελαχιστο αριθμο jumps που ο frog πρεπει να κανει ωστε να φτασει (ή να ξεπερασει) τον στοχο.
 *
 * Για παραδειγμα, αν εχουμε;
 * X = 10
 * Y = 85
 * D = 30
 *
 * τοτε ο frog θα χρειαστει 3 jumps γιατι:
 * Starts at 10, και μετα το 1ο jump παει στη θεση 10+30 = 40
 * Στο 2ο jump παει στη θεση 40 + 30 = 70
 * Και στο 3ο jump παει στη θεση 100.
 */

public class FrogApp {
    public static void main(String[] args) {

        int jumps = 0;
        int x = 10;
        int y = 85;
        int jmp = 30;

        jumps = (int) Math.ceil((y - x) / (double) jmp);

        System.out.println("Jumps: " + jumps);
    }
}
