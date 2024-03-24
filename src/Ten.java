public class Ten {
    public static void main(String[] args) {
        int num = 4;

        // Pattern 10


        // Approach 1

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num-1; i >=1 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

      // Approach 2

        for (int i = 1; i <= (2*num -1) ; i++) {
            int star = i;
            if( i > num) star = (2 * num -i);

            for (int j = 1; j <= star ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
