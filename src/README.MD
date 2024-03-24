# All Pattern Questions For Logical Building 


## 1.   
![P1.webp](Assect%2FP1.webp)

```java
import  java.util.*;
public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:-  ");
        int num = sc.nextInt();

        // Pattern 1

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

```