# LJAAS72

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T19:52:23.207Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);

        //check the first number
        num = scanner.nextInt();
        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }

        //check the second number
        num = scanner.nextInt();
        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS72)