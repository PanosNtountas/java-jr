package gr.aueb.cf.ch7;

public class ForStringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        String substring = s.substring(0);
        System.out.println(substring);

        String substring1 = s.substring(0, 6);
        System.out.println(substring1);

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

        System.out.println("\u2764");

        for (char ch : s.toCharArray()) {
            System.out.print(ch + " ");
        }

        int index = s.indexOf("od");
        System.out.println(index);

        int index2 = s.indexOf("o");
        System.out.println(index2);

        int index3 = s.indexOf("o", 7);
        System.out.println(index3);

        int index4 = s.lastIndexOf("o");
        System.out.println(index4);

        if (s.startsWith("Coding")) System.out.println("Coding Factory");
    }
}
