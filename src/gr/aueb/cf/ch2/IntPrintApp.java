package gr.aueb.cf.ch2;

public class IntPrintApp {
    public static void main(String[] args) {
        int i = 12;
        int x = 504_300_300;

//        System.out.print(i);
//        System.out.println(i);
//        System.out.printf("%d", i);
//
//        System.out.print("result = " + i);
//        System.out.println("result = " + i);
//        System.out.printf("result = %d%n", i); //  %n = \n

        System.out.printf("%4d%n", i);
        System.out.printf("%04d %n", i);
        System.out.printf("%010d %n", i);
        System.out.printf("%,04d %n", x);
    }
}
