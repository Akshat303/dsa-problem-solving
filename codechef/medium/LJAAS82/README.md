# LJAAS82

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T20:02:10.216Z  

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

[View on CodeChef](https://www.codechef.com/problems/LJAAS82)