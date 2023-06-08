package gr.aueb.cf.ch2;

public class RandomDieApp {
    public static void main(String[] args) {
        int die = (int) (Math.random() * 6) + 1; //Dinei panta float to math.random .To random dinei times [0,1)
        System.out.println(die);                // (Math.random() * (max - min +1)) + min
    }
}
