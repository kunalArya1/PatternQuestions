public class Nine {
    public static void main(String[] args) {
        int num = 5;

        // Pattern 9

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i+1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (num-i-1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(2*num) -(2*i+1) ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
