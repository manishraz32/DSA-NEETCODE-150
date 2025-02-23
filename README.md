# 217. Contains Duplicate
Easy

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:
```
Input: nums = [1,2,3,1]
Output: true
```
Example 2:
```
Input: nums = [1,2,3,4]
Output: false
```
Example 3:
```
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 ```

Constraints:

- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i< nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
```
---------------------------------------------------------------------------------------------------------------------------------------------------------
# 242. Valid Anagram
Easy

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:
```
Input: s = "anagram", t = "nagaram"
Output: true
```
Example 2:
```
Input: s = "rat", t = "car"
Output: false
 ```

Constraints:

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.
 
```java
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        } 
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true; 
    }
}
```

### Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
We can be used a map, or a array of size equal to the characterset size of unicode.

------------------------------------------------------------------------------------------------------------------------------------------
