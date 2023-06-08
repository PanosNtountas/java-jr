package gr.aueb.cf.ch3;

/**
 * Linearizes if-then-else.
 */

import java.util.Scanner;

public class LinearBingoApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET_KEY = 17;

        while (true) {
            System.out.println("Please provide a secret num");
            num = in.nextInt();

            if (num == SECRET_KEY) {
                System.out.println("Please try again!");
                continue;
            }

            System.out.println("Bingo!!");
            break;
        }

        /*
            Scanner in = new Scanner(System.in);
            int num = 0;
            final int SECRET_KEY = 17;
            boolean bingo = 0;

            while (!bingo) {
                System.out.println("Please provide a secret num");
                num = in.nextInt();

                if (num == SECRET_KEY) {
                    System.out.println("Please try again!");
                    continue;
                }

                System.out.println("Bingo!!");
                bingo = true;
            }

            ή

            do {
                System.out.println("Please provide a secret num");
                num = in.nextInt();

                if (num == SECRET_KEY) {
                    System.out.println("Please try again!");
                    continue;
                }

                System.out.println("Bingo!!");
                bingo = true;
            } while (!bingo);
         */
    }
}
