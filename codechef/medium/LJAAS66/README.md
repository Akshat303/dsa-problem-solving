# LJAAS66

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T19:46:16.218Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i<3; i++){
            if (sc.hasNextInt()){
                int marks = sc.nextInt();
                
                if (marks > 90){
                    System.out.println("A");
                } else if (marks > 70){
                    System.out.println("B");
                }  else if (marks >= 40){
                    System.out.println("C");
                } else {
                    System.out.println("F");
                }
            }
        }
        sc.close();
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS66)