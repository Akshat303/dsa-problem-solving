# Closest to n and Divisible by m

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integers  **n**  and  **m** (m != 0). The problem is to find the number closest to  **n**  and divisible by  **m**. If there is more than one such number, then output the one having the maximum absolute value.

 **Examples :** 

```
Input: n = 13, m = 4
Output: 12
Explanation: 12 is the Closest Number to 13 which is divisible by 4.
```

```
Input: n = -15, m = 6
Output: -18
Explanation: Both -12 and -18 are closest to -15 and divisible by 6, but -18 has the maximum absolute value. So, output is -18.
```

 **Constraints:** 
-105 ≤ n, m ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T12:29:59.863Z  

```java
class Solution {
    static int closestNumber(int n, int m) {
        // Standard integer division truncates toward zero in Java
        int q = n / m;

        // First candidate multiple
        int n1 = m * q;

        // Second candidate multiple
        int n2 = (n * m > 0) ? (m * (q + 1)) : (m * (q - 1));

        // Distances from n
        int d1 = Math.abs(n - n1);
        int d2 = Math.abs(n - n2);

        // Return candidate with the smaller distance
        if (d1 < d2) {
            return n1;
        } else if (d2 < d1) {
            return n2;
        }

        // Tie-breaker: return the candidate with maximum absolute value
        return (Math.abs(n1) > Math.abs(n2)) ? n1 : n2;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/closest-number5728/1)