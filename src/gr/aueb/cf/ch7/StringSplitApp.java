package gr.aueb.cf.ch7;

/**
 * Splits a string.
 */
public class StringSplitApp {

    public static void main(String[] args) {
        String s = "Athens      Uni of Econ and Business";

        String[] tokens = s.split(" ");

        for (String token : tokens) {
            System.out.println(token);
        }

        String[] tokens2 = s.split(" +");

        for (String token : tokens2) {
            System.out.println(token);
        }
    }
}
