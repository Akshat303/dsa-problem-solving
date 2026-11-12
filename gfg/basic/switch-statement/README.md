# Switch Statement

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a number  **n**, use a switch statement to print

- "Stop" if the given number is 1 (or Red light)
- "Standby" if the number is 2 (Yellow light)
- "Go" if the number is 3 (Green light).
- For any other number, print "Unknown" (without quotes).Examples:

```
Input: n = 1
Output: Stop
```

```
Input: n = 2
Output: Standby
```

```
Input: n = 3
Output: Go
```

```
Input: n = 4
Output: Unknown
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T14:00:37.000Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        switch (n) {
            case 1:
                System.out.println("Stop");
                break;
            case 2:
                System.out.println("Standby");
                break;
            case 3:
                System.out.println("Go");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/switch-statement/1)