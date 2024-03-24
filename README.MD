# All Pattern Questions For Logical Building 


## 1.   
![P1.webp](src%2FAssect%2FP1.webp)

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

## 2. 
![P2.webp](src%2FAssect%2FP2.webp)

```java
import java.util.*;
public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :- ");
        int num = sc.nextInt();

        // Pattern 2

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

```

## 3.
![P3.webp](src%2FAssect%2FP3.webp)

```java
public class third {
    public static void main(String[] args) {
        int num = 5;

        // pattern 3

        for (int i = 0; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

```