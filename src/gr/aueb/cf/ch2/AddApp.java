package gr.aueb.cf.ch2;

/**
 * overflow
 */
public class AddApp {
    public static void main(String[] args) {
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        result = num1 + num2;

        System.out.println("sum: " + result);

        long num3 = 2_147_483_647;
        long num4 = 2;
        long result1 = 0;

        result1 = num3 + num4;

        System.out.println("sum: " + result1);
    }
}
