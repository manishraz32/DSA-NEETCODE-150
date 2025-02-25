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
