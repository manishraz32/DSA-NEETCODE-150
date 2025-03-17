## Binary Search on Answer in Java

### **What is Binary Search on Answer?**
Binary Search on Answer is a technique used to find an optimal value in a numerical range efficiently.
It is applied when:
- The answer lies within a range `[low, high]`.
- We can check if a given `mid` is **valid** using a function.
- The function is **monotonic** (if `X` is valid, then all values > `X` or < `X` follow a pattern).

---

### **Steps to Apply Binary Search on Answer**
1. **Define the search space**: Identify the minimum (`low`) and maximum (`high`) possible values.
2. **Use Binary Search**:
   - Calculate `mid = (low + high) / 2`.
   - Check if `mid` is a valid solution using a helper function.
   - If valid, try optimizing (`low = mid + 1` or `high = mid - 1`).
3. **Repeat until `low` and `high` converge**.

---

### **When Binary Search on Answer DOESN’T Work**
🚫 When the answer isn’t numeric or doesn’t form a range  
🚫 When there’s no clear monotonic property  
🚫 When no validity check function exists  

---

### **Example 1: Allocate Minimum Pages (Book Allocation Problem)**

#### **Problem:**
Given `n` books with pages, allocate them to `m` students such that the **maximum pages assigned** to a student is minimized.

#### **Solution:**
```java
public class BookAllocation {
    static boolean isPossible(int[] books, int students, int maxPages) {
        int count = 1, pagesSum = 0;
        for (int pages : books) {
            if (pagesSum + pages > maxPages) {
                count++;
                pagesSum = pages;
                if (count > students) return false;
            } else {
                pagesSum += pages;
            }
        }
        return true;
    }

    static int allocateBooks(int[] books, int students) {
        if (students > books.length) return -1;
        int low = Integer.MIN_VALUE, high = 0;
        for (int pages : books) {
            low = Math.max(low, pages);
            high += pages;
        }
        
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(books, students, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] books = {10, 20, 30, 40};
        int students = 2;
        System.out.println("Minimum Maximum Pages: " + allocateBooks(books, students));
    }
}
```
#### **Complexity:** `O(N log(sum(books)))`

---

### **Example 2: Aggressive Cows (Maximize Minimum Distance)**

#### **Problem:**
Given an array of stall positions, place `k` cows such that the **minimum distance between any two cows is maximized**.

#### **Solution:**
```java
import java.util.Arrays;

public class AggressiveCows {
    static boolean canPlaceCows(int[] stalls, int cows, int minDist) {
        int count = 1, lastPlaced = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPlaced >= minDist) {
                count++;
                lastPlaced = stalls[i];
                if (count == cows) return true;
            }
        }
        return false;
    }

    static int maxMinDistance(int[] stalls, int cows) {
        Arrays.sort(stalls);
        int low = 1, high = stalls[stalls.length - 1] - stalls[0], result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (canPlaceCows(stalls, cows, mid)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};
        int cows = 3;
        System.out.println("Maximized Minimum Distance: " + maxMinDistance(stalls, cows));
    }
}
```
#### **Complexity:** `O(N log(max(stalls) - min(stalls)))`

---

### **Key Takeaways**
✅ Use Binary Search on Answer when:
- The answer is in a **numerical range**.
- A **validity check function** exists.
- The function follows a **monotonic** pattern.

Would you like more Java problems using Binary Search on Answer? 🚀
