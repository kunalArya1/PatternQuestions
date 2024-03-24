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

## 4. 
![P4.webp](src%2FAssect%2FP4.webp)

```java
public class four {
    public static void main(String[] args) {
        int num = 5;

        // Pattern 4

        for (int i = 1; i <= num ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

```

## 5.
![P5.webp](src%2FAssect%2FP5.webp)

```java
public class five {
    public static void main(String[] args) {
        int num = 5;

        // Pattern 5

        for (int i = num; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

```

## 6.
![P6.webp](src%2FAssect%2FP6.webp)

```java
public class six {
    public static void main(String[] args) {
        int num = 5;

        // Pattern 6

        for (int i = num; i >0 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

```

## 7.
![P7.webp](src%2FAssect%2FP7.webp)
```java
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

```

## 8.
![P8.webp](src%2FAssect%2FP8.webp)

```java
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

```

## 9.
![P9.webp](src%2FAssect%2FP9.webp)

```java
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

```

## 10.
![P10.webp](src%2FAssect%2FP10.webp)

```java
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

```