package gr.aueb.cf.ch2;

/**
 * Εμφανιζει τους τυπους δεδομενων
 * ακεραιων, το μεγεθος και τα
 * MIN - MAX values.
 *
 */
public class IntTypesApp {
    public static void main(String[] args) {
        System.out.printf("Type: %s, Size: %d bits, Min: %d, Max: %d\n",
                Integer.TYPE, Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %d, Max: %d\n",
                Byte.TYPE, Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %d, Max: %d\n",
                Short.TYPE, Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %d, Max: %d\n",
                Long.TYPE, Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println();

        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n",
                Integer.TYPE, Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %d, Max: %d\n",
                Byte.TYPE, Byte.BYTES * 8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %d, Max: %d\n",
                Short.TYPE, Short.BYTES * 8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %,d, Max: %,d\n",
                Long.TYPE, Long.BYTES * 8, Long.MIN_VALUE, Long.MAX_VALUE);


        System.out.printf("Type: %s, Size: %d bits, Min: %,f, Max: %,f\n",
                Float.TYPE, Float.BYTES * 8, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Type: %s, Size: %d bits, Min: %,f, Max: %,f\n",
                Double.TYPE, Double.BYTES * 8, Double.MIN_VALUE, Double.MAX_VALUE);
    }
}
