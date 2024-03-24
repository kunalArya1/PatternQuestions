public class Eight {
    public static void main(String[] args) {
        int num = 6;

        // Pattern 8

        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*num)-(2*i+1) ; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
