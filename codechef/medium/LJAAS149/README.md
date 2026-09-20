# LJAAS149

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program that takes t test cases as input, then for each test case, reads an integer N, and prints N + 1.

### Sample 1:
Input
Output

```
3
4
2
-1
```

```
5
3
0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T20:23:51.653Z  

```java
import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		if (sc.hasNextInt()){
		    int t = sc.nextInt();
		    while (t-- > 0){
		        int n = sc.nextInt();
		        System.out.println(n + 1);
		    }
		}
		
		sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS149)