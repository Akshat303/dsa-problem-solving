# For-Each Loop

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of Strings  **arr[].**  Use  **For-Each**  loop to print each string in the array in a new line.

 **Examples:** 

```
Input: arr[] = [ "Hello", "World", "Geeks", "For", "Geeks" ]
Output:
Hello
World
Geeks
For
Geeks
Explanation: All Strings of array are printed in a new line.

```

```
Input: arr[] = [ "Legends" ]
Output:
Legends
Explanation: Only string is printed in a new line.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T13:01:18.683Z  

```java
class Solution {
    public void printArray(String[] arr) {

        for (String str : arr) {
            System.out.println(str);
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/for-each-loop/1)