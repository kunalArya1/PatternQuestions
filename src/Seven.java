public class Seven {
    public static void main(String[] args) {
        int num = 6;

        // Pattern Seven

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <  (num-i-1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < ( num - i-1); j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
