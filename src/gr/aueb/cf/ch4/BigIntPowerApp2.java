package gr.aueb.cf.ch4;

/**
 * Υπολογιζει το a^n με BigInteger
 */

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntPowerApp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int n;
        BigInteger result = new BigInteger("1"); //ή BigInteger result = BigInteger.ONE;

        System.out.println("Please insert two ints , base and power");
        a = in.nextInt();
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(a));
        }

        System.out.printf("%d^%d = %,d", a, n, result);

    }
}
