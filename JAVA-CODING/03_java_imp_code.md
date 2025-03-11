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

