package gr.aueb.cf.ch5;

/**
 * Προσθετει δυο ακεραιους με τη χρηση της μεθοδου add.
 */

public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a, b); // ή sum = AddApp.add(a, b)

        System.out.println(sum);

    }

    public static int add(int a, int b) {
//        int sum = 0;
//        sum = a + b;
//        return sum;
        return a + b;

    }
}
