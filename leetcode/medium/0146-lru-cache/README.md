# LRU Cache

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Design a data structure that follows the constraints of a  **Least Recently Used (LRU) cache**.

Implement the `LRUCache` class:

- LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
- int get(int key) Return the value of the key if the key exists, otherwise return -1.
- void put(int key, int value) Update the value of the key if the key exists. Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation, evict the least recently used key.

The functions `get` and `put` must each run in `O(1)` average time complexity.

 

 **Example 1:** 

```
Input
["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
[[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
Output
[null, null, null, 1, null, -1, null, -1, 3, 4]

Explanation
LRUCache lRUCache = new LRUCache(2);
lRUCache.put(1, 1); // cache is {1=1}
lRUCache.put(2, 2); // cache is {1=1, 2=2}
lRUCache.get(1);    // return 1
lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
lRUCache.get(2);    // returns -1 (not found)
lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
lRUCache.get(1);    // return -1 (not found)
lRUCache.get(3);    // return 3
lRUCache.get(4);    // return 4

```

 

 **Constraints:** 

- 1 <= capacity <= 3000
- 0 <= key <= 104
- 0 <= value <= 105
- At most 2 * 105 calls will be made to get and put.

## Solution

**Language:** Java  
**Runtime:** 12 ms (beats 99.67%)  
**Memory:** 58.7 MB (beats 76.56%)  
**Submitted:** 2026-09-25T09:59:54.939Z  

```java
import java.util.HashMap;

class LRUCache {

    // Node for Doubly Linked List
    class Node {
        int key;
        int value;
        Node prev;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;

    // Key -> Node
    private HashMap<Integer, Node> map;

    // Dummy nodes
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {

        this.capacity = capacity;

        map = new HashMap<>();

        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {

        // Key not present
        if (!map.containsKey(key)) {
            return -1;
        }

        // Get node
        Node node = map.get(key);

        // Mark as recently used
        remove(node);
        addToFront(node);

        return node.value;
    }

    public void put(int key, int value) {

        // Key already exists
        if (map.containsKey(key)) {

            Node node = map.get(key);

            // Update value
            node.value = value;

            // Mark as recently used
            remove(node);
            addToFront(node);

            return;
        }

        // Create new node
        Node node = new Node(key, value);

        // Store in HashMap
        map.put(key, node);

        // Add to front
        addToFront(node);

        // Capacity exceeded
        if (map.size() > capacity) {

            // Least Recently Used node
            Node lru = tail.prev;

            // Remove from list
            remove(lru);

            // Remove from map
            map.remove(lru.key);
        }
    }

    // Add node just after head
    private void addToFront(Node node) {

        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    // Remove node from linked list
    private void remove(Node node) {

        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/lru-cache/)