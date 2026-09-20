# LJAAS80

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program that takes two numbers and an operator (+, -, *, /) as input. Use a  **switch**  statement to perform the corresponding arithmetic operation and print the result.

### Sample 1:
Input
Output

```
5 2 +
```

```
7
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T20:02:07.205Z  

```java
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        //your code goes InheritableThreadLocal
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int a = sc.nextInt();
        
        if (!sc.hasNextInt()) return;
        int b = sc.nextInt();
        
        char op = sc.next().charAt(0);
        
        switch (op){
            case  '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if (b !=0){
                System.out.println(a / b);
                }
                break;
            default :
            break;
        }
        
        sc.close();
        
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS80)