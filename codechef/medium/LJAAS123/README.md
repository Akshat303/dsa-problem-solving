# LJAAS123

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program to generate and print the  **Fibonacci series**  up to the  **10th term**  using a for-loop.
The  **Fibonacci series**  is the sequence where each number is the  **sum of the previous two numbers of the sequence**.
The number at the  **nth position**  can be represented by:
 **Fn = Fn-1 + Fn-2** 
where,
 **F0 = 0 and F1 = 1**.

### Sample 1:
Input
Output

```

```

```
0 1 1 2 3 5 8 13 21 34 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T20:13:28.234Z  

```java
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		int a = 0 , b = 1;
		for (int i = 0 ; i < 10 ; i++){
		    System.out.print(a + " ");
		    int next = a + b ;
		     a = b;
		      b = next ;
		}

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS123)