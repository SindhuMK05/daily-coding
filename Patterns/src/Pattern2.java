public class Pattern2 {
    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) { //outer for loop (rows)
            for (int j = 1; j <= 5 - i; j++) { // inner for loop(columns)
                System.out.print("*");
            }
            System.out.println("* ");
        }

    }
}
