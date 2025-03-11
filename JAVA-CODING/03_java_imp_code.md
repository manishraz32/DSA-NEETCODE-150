# Finding the K-th Largest Number in Java Using BigInteger

## Introduction
This Java program finds the **K-th largest number** from a list of numbers represented as strings. Since some numbers may be very large (beyond `Integer.MAX_VALUE` or `Long.MAX_VALUE`), it uses `BigInteger` to handle arbitrary-precision arithmetic.

## Implementation Details
### Key Concepts
- **`BigInteger`**: Used for handling very large numbers.
- **Min Heap (`PriorityQueue`)**: Maintains the `k` largest numbers.

## Code Implementation
```java
import java.math.BigInteger;
import java.util.PriorityQueue;

class Solution {
    public BigInteger toInteger(String strs) {
        return new BigInteger(strs); // Convert string to BigInteger
    }

    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> minHeap = new PriorityQueue<>((a, b) -> toInteger(a).compareTo(toInteger(b)));
        
        for (String num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.poll(); // Return the k-th largest element
    }
}
```

## Explanation
1. **`toInteger(String strs)`**
   - Converts a string representation of a number into a `BigInteger`.
2. **`kthLargestNumber(String[] nums, int k)`**
   - Uses a **Min Heap** (`PriorityQueue`) to keep track of the `k` largest numbers.
   - Compares numbers using `BigInteger.compareTo()` to handle large values.
   - When the heap exceeds size `k`, the smallest element is removed to ensure the top of the heap always contains the K-th largest number.
   
## Example Usage
```java
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] nums = {"3", "6", "2", "8", "10", "100", "999999999999999999"};
        int k = 3;
        System.out.println("K-th largest number: " + solution.kthLargestNumber(nums, k));
    }
}
```
### **Output:**
```
K-th largest number: 10
```

## Complexity Analysis
- **Heap Operations**: `O(log k)` for insertion and deletion.
- **Total Time Complexity**: `O(n log k)`, where `n` is the number of elements in `nums`.
- **Space Complexity**: `O(k)`, as the heap stores at most `k` elements.

## Conclusion
This solution efficiently finds the K-th largest number from an array of large numbers using `BigInteger` and a **Min Heap**.
---
# Substring Problems - Different Approaches

## 1. Brute Force (O(n³) or O(n²))
- Generate all possible substrings and check conditions (e.g., uniqueness, palindromes).
- **Use when constraints are small (n ≤ 100).**  

### Example: Longest Substring Without Repeating Characters
```java
public int lengthOfLongestSubstring(String s) {
    int maxLen = 0;
    for (int i = 0; i < s.length(); i++) {
        HashSet<Character> set = new HashSet<>();
        for (int j = i; j < s.length(); j++) {
            if (set.contains(s.charAt(j))) break;
            set.add(s.charAt(j));
            maxLen = Math.max(maxLen, j - i + 1);
        }
    }
    return maxLen;
}
```

---

## 2. Sliding Window (O(n))
- Use two pointers (`left` and `right`) to maintain a valid window.
- Expand `right`, and when constraints break, shrink `left`.
- **Use when constraints involve unique characters, maximum length, or k distinct elements.**  

### Example: Longest Substring Without Repeating Characters
```java
public int lengthOfLongestSubstring(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    int left = 0, maxLen = 0;
    for (int right = 0; right < s.length(); right++) {
        char c = s.charAt(right);
        if (map.containsKey(c)) {
            left = Math.max(left, map.get(c) + 1);
        }
        map.put(c, right);
        maxLen = Math.max(maxLen, right - left + 1);
    }
    return maxLen;
}
```

---

## 3. Two Pointers (O(n) or O(n log n))
- Used when comparing two substrings or finding valid ranges.
- **Similar to Sliding Window but sometimes both pointers move independently.**  

### Example: Substrings with At Most `k` Distinct Characters
```java
public int atMostKDistinct(String s, int k) {
    int left = 0, count = 0;
    HashMap<Character, Integer> freq = new HashMap<>();
    for (int right = 0; right < s.length(); right++) {
        freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0) + 1);
        while (freq.size() > k) {
            freq.put(s.charAt(left), freq.get(s.charAt(left)) - 1);
            if (freq.get(s.charAt(left)) == 0) freq.remove(s.charAt(left));
            left++;
        }
        count += right - left + 1;
    }
    return count;
}
```

---

## 4. HashMap / Frequency Map (O(n))
- Store character frequencies for substring constraints.
- **Use when checking substring constraints (frequency, unique counts).**  

### Example: Longest Substring with Exactly `k` Distinct Characters
```java
public int longestSubstringKDistinct(String s, int k) {
    HashMap<Character, Integer> map = new HashMap<>();
    int left = 0, maxLen = 0;
    for (int right = 0; right < s.length(); right++) {
        map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
        while (map.size() > k) {
            map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
            if (map.get(s.charAt(left)) == 0) map.remove(s.charAt(left));
            left++;
        }
        maxLen = Math.max(maxLen, right - left + 1);
    }
    return maxLen;
}
```

---

## 5. Dynamic Programming (O(n²) or O(n³))
- Store results in a DP table to avoid redundant calculations.
- **Best for palindromic substrings, longest common substring.**  

### Example: Longest Palindromic Substring
```java
public String longestPalindrome(String s) {
    int n = s.length();
    boolean[][] dp = new boolean[n][n];
    int start = 0, maxLength = 0;
    
    for (int len = 1; len <= n; len++) {
        for (int i = 0; i <= n - len; i++) {
            int j = i + len - 1;
            if (s.charAt(i) == s.charAt(j) && (len <= 2 || dp[i + 1][j - 1])) {
                dp[i][j] = true;
                if (len > maxLength) {
                    start = i;
                    maxLength = len;
                }
            }
        }
    }
    return s.substring(start, start + maxLength);
}
```

---

## 6. Manacher’s Algorithm (O(n))
- Used **only for longest palindromic substring problems**.
- Expands around center efficiently in linear time.  

### Example: Longest Palindromic Substring
```java
public String longestPalindrome(String s) {
    String T = "#" + String.join("#", s.split("")) + "#";
    int[] P = new int[T.length()];
    int C = 0, R = 0, maxLen = 0, center = 0;

    for (int i = 0; i < T.length(); i++) {
        int mirror = 2 * C - i;
        if (i < R) P[i] = Math.min(R - i, P[mirror]);
        while (i + P[i] + 1 < T.length() && i - P[i] - 1 >= 0 &&
               T.charAt(i + P[i] + 1) == T.charAt(i - P[i] - 1)) {
            P[i]++;
        }
        if (i + P[i] > R) {
            C = i;
            R = i + P[i];
        }
        if (P[i] > maxLen) {
            maxLen = P[i];
            center = i;
        }
    }
    return s.substring((center - maxLen) / 2, (center + maxLen) / 2);
}
```

---

## Summary of Approaches
| Approach | Best For | Time Complexity |
|----------|---------|----------------|
| Brute Force | Small inputs | O(n³) |
| Sliding Window | Longest unique substring | O(n) |
| Two Pointers | Substring constraints | O(n) |
| HashMap | k distinct characters | O(n) |
| DP | Palindromes | O(n²) |
| Manacher’s | Longest palindrome | O(n) |

---
# use this method when you have to delete key during traverse
```java
 Iterator<Integer> iterator = map.keySet().iterator();
 while (iterator.hasNext()) {
    int key = iterator.next();
    minHeap.add(key);
    int freq = map.get(key);

    System.out.println("key: " + key);

    if (k >= freq) {
        k = k - freq;
        iterator.remove(); // Safely removes the current key
    } else {
        break;
    }
}
```



