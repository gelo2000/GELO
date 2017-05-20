package lessons;

public class LearnCondition {
    public static void main(String[] args) {
        int d = 7;
        if (d < 10) {
            System.out.println("d < 10");
        } else {
            System.out.println("d>10");
        }

        if (d < 10) {
            System.out.println("d < 10");
        } else if (d > 5) {
            System.out.println("d < 10 and d > 5");
        } else {
            System.out.println("d < 5");
        }

//        && - and, || - or
        if (d < 10 && d > 5) {
            System.out.println("d < 10 and d > 5");
        }
    }
}
