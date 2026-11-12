# Print GFG n times

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a positive number  **n**, print the string " **GFG** " exactly n times separated by a single space.

 **Examples:** 

```
Input: n = 5
Output: GFG GFG GFG GFG GFG
Explanation: The string "GFG" is printed 5 times, with each instance separated by a space.
```

```
Input: 3
Output: GFG GFG GFG
Explanation: The string "GFG" is printed 3 times separated by spaces.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T14:16:58.738Z  

```java
class Solution {
    void printGfg(int n) {
        // code her
        int i =0;
        while(i < n){
            System.out.print("GFG ");
            i++;
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-gfg-n-times/1)