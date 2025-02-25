# Java Functions for Competitive Programmin

This document covers the most **important Java functions** used in **competitive programming**, including fast I/O, math functions, data structures, and algorithms.

---

## **1. Fast Input & Output Handling**
Competitive programming requires **fast I/O**. Avoid `Scanner` and use **BufferedReader & PrintWriter**.

### **Fast Input**
```java
import java.io.*;

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String input = br.readLine(); // Reads a full line
int num = Integer.parseInt(br.readLine()); // Reads an integer
```

### **Fast Output**
```java
import java.io.*;

PrintWriter out = new PrintWriter(System.out);
out.println("Hello, World!");
out.flush(); // Ensure output is printed
```

### **Reading Multiple Inputs**
```java
String[] inputs = br.readLine().split(" ");
int a = Integer.parseInt(inputs[0]);
int b = Integer.parseInt(inputs[1]);
```

---

## **2. Math Functions (java.lang.Math)**
Java provides built-in functions for common mathematical operations.

| Function | Description |
|----------|-------------|
| `Math.abs(x)` | Absolute value |
| `Math.max(a, b)` | Maximum of two numbers |
| `Math.min(a, b)` | Minimum of two numbers |
| `Math.sqrt(x)` | Square root |
| `Math.pow(x, y)` | Power function (x^y) |
| `Math.floor(x)` | Rounds down |
| `Math.ceil(x)` | Rounds up |
| `Math.round(x)` | Rounds to nearest integer |
| `Math.log(x)` | Natural logarithm |
| `Math.log10(x)` | Base-10 logarithm |
| `Math.sin(x), Math.cos(x), Math.tan(x)` | Trigonometric functions |
| `Math.gcd(a, b)` | Greatest Common Divisor (Java 9+) |

**Example:**
```java
int gcd = Math.gcd(12, 18); // 6
double power = Math.pow(2, 5); // 32.0
```

---

## **3. Arrays (java.util.Arrays)**
Java has built-in utilities for **sorting, searching, and manipulating arrays**.

| Function | Description |
|----------|-------------|
| `Arrays.sort(arr)` | Sorts an array in ascending order (O(n log n)) |
| `Arrays.sort(arr, Collections.reverseOrder())` | Sorts in descending order |
| `Arrays.fill(arr, value)` | Fills an array with a value |
| `Arrays.copyOf(arr, newLength)` | Copies an array |
| `Arrays.binarySearch(arr, key)` | Finds index of `key` in sorted array |
| `Arrays.equals(arr1, arr2)` | Compares two arrays |
| `Arrays.toString(arr)` | Converts array to a string |

**Example:**
```java
import java.util.Arrays;

int[] arr = {5, 1, 4, 2, 8};
Arrays.sort(arr); // [1, 2, 4, 5, 8]
```

---

## **4. String Operations (java.lang.String)**
String manipulation is crucial in CP.

| Function | Description |
|----------|-------------|
| `s.length()` | Returns length of the string |
| `s.charAt(i)` | Returns character at index `i` |
| `s.substring(start, end)` | Extracts substring from `start` to `end-1` |
| `s.indexOf(ch)` | Finds first occurrence of `ch` |
| `s.lastIndexOf(ch)` | Finds last occurrence of `ch` |
| `s.contains("xyz")` | Checks if substring exists |
| `s.replace("a", "b")` | Replaces characters |
| `s.split(" ")` | Splits string by space or regex |
| `s.toCharArray()` | Converts string to char array |

**Example:**
```java
String str = "  Hello World  ";
String trimmed = str.trim(); // "Hello World"
char firstChar = str.charAt(0); // 'H'
```

---

# ArrayList Methods in Java

This document provides a comprehensive list of **ArrayList** methods in Java along with examples.

## **1. Creating an ArrayList**
```java
import java.util.ArrayList;

ArrayList<String> list = new ArrayList<>();
```
---

## **2. Adding Elements**
| Method | Description |
|--------|-------------|
| `add(E e)` | Appends the specified element to the end of the list. |
| `add(int index, E element)` | Inserts the element at the specified position. |

```java
list.add("Apple");
list.add(1, "Banana");
```

---

## **3. Accessing Elements**
| Method | Description |
|--------|-------------|
| `get(int index)` | Returns the element at the specified position. |

```java
String fruit = list.get(0); // "Apple"
```

---

## **4. Modifying Elements**
| Method | Description |
|--------|-------------|
| `set(int index, E element)` | Replaces the element at the specified position. |

```java
list.set(0, "Mango");
```

---

## **5. Removing Elements**
| Method | Description |
|--------|-------------|
| `remove(int index)` | Removes the element at the specified position. |
| `remove(Object o)` | Removes the first occurrence of the specified element. |
| `clear()` | Removes all elements from the list. |

```java
list.remove(0);
list.remove("Banana");
list.clear();
```

---

## **6. Checking Size and Emptiness**
| Method | Description |
|--------|-------------|
| `size()` | Returns the number of elements in the list. |
| `isEmpty()` | Returns `true` if the list is empty. |

```java
int size = list.size();
boolean empty = list.isEmpty();
```

---

## **7. Searching Elements**
| Method | Description |
|--------|-------------|
| `contains(Object o)` | Returns `true` if the list contains the specified element. |
| `indexOf(Object o)` | Returns the index of the first occurrence of the element. |
| `lastIndexOf(Object o)` | Returns the index of the last occurrence. |

```java
boolean hasApple = list.contains("Apple");
int index = list.indexOf("Apple");
```

---

## **8. Iterating Over Elements**
```java
for (String item : list) {
    System.out.println(item);
}

list.forEach(System.out::println);
```

---

## **9. Converting to Array**
```java
String[] array = list.toArray(new String[0]);
```

---

## **10. Sorting Elements**
```java
import java.util.Collections;

Collections.sort(list);
```

---

# LinkedList Methods in Java

This document provides a comprehensive list of **LinkedList** methods in Java along with examples.

## **1. Creating a LinkedList**
```java
import java.util.LinkedList;

LinkedList<String> list = new LinkedList<>();
```
---

## **2. Adding Elements**
| Method | Description |
|--------|-------------|
| `add(E e)` | Appends the specified element to the end of the list. |
| `add(int index, E element)` | Inserts the element at the specified position. |
| `addFirst(E e)` | Inserts the element at the beginning. |
| `addLast(E e)` | Inserts the element at the end. |

```java
list.add("Apple");
list.add(1, "Banana");
list.addFirst("Mango");
list.addLast("Orange");
```

---

## **3. Accessing Elements**
| Method | Description |
|--------|-------------|
| `get(int index)` | Returns the element at the specified position. |
| `getFirst()` | Returns the first element. |
| `getLast()` | Returns the last element. |

```java
String fruit = list.get(0); // "Mango"
String first = list.getFirst(); // "Mango"
String last = list.getLast(); // "Orange"
```

---

## **4. Modifying Elements**
| Method | Description |
|--------|-------------|
| `set(int index, E element)` | Replaces the element at the specified position. |

```java
list.set(0, "Grapes");
```

---

## **5. Removing Elements**
| Method | Description |
|--------|-------------|
| `remove(int index)` | Removes the element at the specified position. |
| `remove(Object o)` | Removes the first occurrence of the specified element. |
| `removeFirst()` | Removes the first element. |
| `removeLast()` | Removes the last element. |
| `clear()` | Removes all elements from the list. |

```java
list.remove(0);
list.remove("Banana");
list.removeFirst();
list.removeLast();
list.clear();
```

---

## **6. Checking Size and Emptiness**
| Method | Description |
|--------|-------------|
| `size()` | Returns the number of elements in the list. |
| `isEmpty()` | Returns `true` if the list is empty. |

```java
int size = list.size();
boolean empty = list.isEmpty();
```

---

## **7. Searching Elements**
| Method | Description |
|--------|-------------|
| `contains(Object o)` | Returns `true` if the list contains the specified element. |
| `indexOf(Object o)` | Returns the index of the first occurrence of the element. |
| `lastIndexOf(Object o)` | Returns the index of the last occurrence. |

```java
boolean hasApple = list.contains("Apple");
int index = list.indexOf("Apple");
```

---

## **8. Iterating Over Elements**
```java
for (String item : list) {
    System.out.println(item);
}

list.forEach(System.out::println);
```

---

## **9. Converting to Array**
```java
String[] array = list.toArray(new String[0]);
```

---

## **10. Sorting Elements**
```java
import java.util.Collections;

Collections.sort(list);
```

---

# Stack Methods in Java

This document provides a comprehensive list of **Stack** methods in Java along with examples.

## **1. Creating a Stack**
```java
import java.util.Stack;

Stack<String> stack = new Stack<>();
```
---

## **2. Pushing Elements**
| Method | Description |
|--------|-------------|
| `push(E item)` | Pushes an item onto the top of the stack. |

```java
stack.push("Apple");
stack.push("Banana");
```

---

## **3. Popping Elements**
| Method | Description |
|--------|-------------|
| `pop()` | Removes and returns the top element of the stack. |

```java
String topElement = stack.pop();
```

---

## **4. Peeking Elements**
| Method | Description |
|--------|-------------|
| `peek()` | Returns the top element without removing it. |

```java
String top = stack.peek();
```

---

## **5. Checking if Stack is Empty**
| Method | Description |
|--------|-------------|
| `empty()` | Returns `true` if the stack is empty. |

```java
boolean isEmpty = stack.empty();
```

---

## **6. Searching Elements**
| Method | Description |
|--------|-------------|
| `search(Object o)` | Returns the 1-based position of an object in the stack. Returns `-1` if not found. |

```java
int position = stack.search("Apple");
```

---

## **7. Iterating Over Elements**
```java
for (String item : stack) {
    System.out.println(item);
}
```

---
# Queue Methods in Java

This document provides a comprehensive list of **Queue** methods in Java along with examples.

## **1. Creating a Queue**
```java
import java.util.LinkedList;
import java.util.Queue;

Queue<String> queue = new LinkedList<>();
```
---

## **2. Adding Elements**
| Method | Description |
|--------|-------------|
| `add(E e)` | Inserts the element into the queue. Throws an exception if the queue is full. |
| `offer(E e)` | Inserts the element into the queue. Returns `false` if the queue is full. |

```java
queue.add("Apple");
queue.offer("Banana");
```

---

## **3. Removing Elements**
| Method | Description |
|--------|-------------|
| `remove()` | Removes and returns the head of the queue. Throws an exception if the queue is empty. |
| `poll()` | Removes and returns the head of the queue. Returns `null` if the queue is empty. |

```java
String removedElement = queue.remove();
String polledElement = queue.poll();
```

---

## **4. Peeking Elements**
| Method | Description |
|--------|-------------|
| `element()` | Retrieves, but does not remove, the head of the queue. Throws an exception if empty. |
| `peek()` | Retrieves, but does not remove, the head of the queue. Returns `null` if empty. |

```java
String head = queue.element();
String peeked = queue.peek();
```

---

## **5. Checking if Queue is Empty**
| Method | Description |
|--------|-------------|
| `isEmpty()` | Returns `true` if the queue is empty. |

```java
boolean isEmpty = queue.isEmpty();
```

---

## **6. Checking Queue Size**
| Method | Description |
|--------|-------------|
| `size()` | Returns the number of elements in the queue. |

```java
int size = queue.size();
```

---

## **7. Iterating Over Elements**
```java
for (String item : queue) {
    System.out.println(item);
}
```

---

