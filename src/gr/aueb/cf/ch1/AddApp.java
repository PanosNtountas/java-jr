package gr.aueb.cf.ch1;

public class AddApp {
    public static void main(String[] args) {
        //Δήλωση και αρχικοποίηση μεταβλητών
        //γράφεται και ως: int num1 = 10, num2 = 7, result = 0; σε μια γραμμή
        int num1 = 10;
        int num2 = 7;
        int result = 0;

        //εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το αποτέλεσμα των " + num1 + ", " + num2 + " είναι " + result);
        System.out.printf("Το αποτέλεσμα των %d, %d είναι %d", num1, num2, result);
    }
}
