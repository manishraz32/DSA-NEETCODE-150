# Set Interface Methods in Java

This document provides a comprehensive list of **Set** interface methods in Java along with examples.

## **1. Creating a Set**
```java
import java.util.HashSet;
import java.util.Set;

Set<String> set = new HashSet<>();
```
---

## **2. Adding Elements**
| Method | Description |
|--------|-------------|
| `add(E e)` | Adds the specified element if it is not already present. |
| `addAll(Collection<? extends E> c)` | Adds all elements from the specified collection. |

```java
set.add("Apple");
set.addAll(Arrays.asList("Banana", "Cherry"));
```

---

## **3. Removing Elements**
| Method | Description |
|--------|-------------|
| `remove(Object o)` | Removes the specified element from the set. |
| `clear()` | Removes all elements from the set. |

```java
set.remove("Apple");
set.clear();
```

---

## **4. Checking Elements**
| Method | Description |
|--------|-------------|
| `contains(Object o)` | Checks if the set contains the specified element. |
| `isEmpty()` | Checks if the set is empty. |

```java
boolean hasApple = set.contains("Apple");
boolean empty = set.isEmpty();
```

---

## **5. Getting Size**
| Method | Description |
|--------|-------------|
| `size()` | Returns the number of elements in the set. |

```java
int size = set.size();
```

---

## **6. Iterating Over Elements**
```java
for (String item : set) {
    System.out.println(item);
}

set.forEach(System.out::println);
```

---

## **7. Converting to Array**
```java
String[] array = set.toArray(new String[0]);
```

---

## **8. Performing Set Operations**
| Operation | Description |
|-----------|-------------|
| `retainAll(Collection<?> c)` | Retains only elements present in the specified collection (intersection). |
| `removeAll(Collection<?> c)` | Removes all elements in the specified collection (difference). |

```java
Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
Set<String> set2 = new HashSet<>(Arrays.asList("B", "C", "D"));

set1.retainAll(set2); // Intersection: {"B", "C"}
set1.removeAll(set2); // Difference: {"A"}
```

---

# HashMap Methods in Java

This document provides a comprehensive list of **HashMap** methods in Java along with examples.

## **1. Creating a HashMap**
```java
import java.util.HashMap;
import java.util.Map;

Map<Integer, String> map = new HashMap<>();
```
---

## **2. Adding Elements**
| Method | Description |
|--------|-------------|
| `put(K key, V value)` | Inserts a key-value pair into the map. |
| `putAll(Map<? extends K, ? extends V> m)` | Copies all mappings from the specified map. |
| `putIfAbsent(K key, V value)` | Inserts the key-value pair only if the key is not already present. |

```java
map.put(1, "Apple");
map.put(2, "Banana");
map.putIfAbsent(3, "Cherry");
```

---

## **3. Accessing Elements**
| Method | Description |
|--------|-------------|
| `get(Object key)` | Returns the value associated with the specified key. |
| `getOrDefault(Object key, V defaultValue)` | Returns the value for the key or a default value if the key is absent. |

```java
String fruit = map.get(1);
String defaultFruit = map.getOrDefault(5, "Unknown");
```

---

## **4. Removing Elements**
| Method | Description |
|--------|-------------|
| `remove(Object key)` | Removes the mapping for the specified key. |
| `remove(Object key, Object value)` | Removes the key only if it is mapped to the specified value. |
| `clear()` | Removes all mappings from the map. |

```java
map.remove(1);
map.remove(2, "Banana");
map.clear();
```

---

## **5. Checking Elements**
| Method | Description |
|--------|-------------|
| `containsKey(Object key)` | Checks if the map contains the specified key. |
| `containsValue(Object value)` | Checks if the map contains the specified value. |
| `isEmpty()` | Returns `true` if the map is empty. |

```java
boolean hasKey = map.containsKey(1);
boolean hasValue = map.containsValue("Apple");
boolean empty = map.isEmpty();
```

---

## **6. Getting Size**
| Method | Description |
|--------|-------------|
| `size()` | Returns the number of key-value mappings in the map. |

```java
int size = map.size();
```

---

## **7. Iterating Over Elements**
```java
for (Map.Entry<Integer, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}

map.forEach((key, value) -> System.out.println(key + " -> " + value));
```

---

## **8. Key Set and Values**
| Method | Description |
|--------|-------------|
| `keySet()` | Returns a set view of the keys. |
| `values()` | Returns a collection view of the values. |
| `entrySet()` | Returns a set view of the key-value mappings. |

```java
Set<Integer> keys = map.keySet();
Collection<String> values = map.values();
Set<Map.Entry<Integer, String>> entries = map.entrySet();
```

---

## **9. Merging and Replacing Elements**
| Method | Description |
|--------|-------------|
| `merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction)` | Merges the specified value with an existing one using a function. |
| `replace(K key, V value)` | Replaces the value for a key if it exists. |
| `replace(K key, V oldValue, V newValue)` | Replaces the key’s value only if it matches the old value. |

```java
map.merge(1, "Orange", (oldValue, newValue) -> oldValue + ", " + newValue);
map.replace(2, "Banana");
map.replace(3, "Cherry", "Grapes");
```

---
# Comparable, Comparator, and Lambda in Java

## **1. Comparable Interface**  
The `Comparable<T>` interface allows a class to define its natural ordering.

### **Example: Sorting a List of Students by Marks**
```java
import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks); // Ascending order
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 75));
        students.add(new Student("Charlie", 90));

        Collections.sort(students); // Uses Comparable

        System.out.println(students);
    }
}
```

---

## **2. Comparator Interface**  
The `Comparator<T>` interface allows custom sorting logic without modifying the class.

### **Example: Sorting by Name Using Comparator**
```java
import java.util.*;

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name); // Alphabetical order
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 75));
        students.add(new Student("Charlie", 90));

        Collections.sort(students, new NameComparator()); // Sorting by name

        System.out.println(students);
    }
}
```

---

## **3. Using Lambda Expressions with Comparator**  
Instead of writing a separate `Comparator` class, we can use a **lambda function**.

### **Example: Sorting by Marks Using Lambda**
```java
import java.util.*;

public class LambdaComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 75));
        students.add(new Student("Charlie", 90));

        // Sorting in descending order using a lambda function
        students.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));

        System.out.println(students);
    }
}
```

---

## **4. Method References in Comparator**  
We can also use method references for readability.

```java
students.sort(Comparator.comparingInt(s -> s.marks)); // Ascending order
students.sort(Comparator.comparingInt(Student::getMarks).reversed()); // Descending order
```

---

## **Key Differences:**
| Feature | `Comparable` | `Comparator` |
|---------|-------------|-------------|
| Interface | Implements `Comparable<T>` | Implements `Comparator<T>` |
| Method | `compareTo(T o)` | `compare(T o1, T o2)` |
| Sorting Logic | Defined in the class | External class or lambda |
| Multiple Sorting | No | Yes, can have multiple |

---

## **Best Practices**
- Use `Comparable` when objects have a natural ordering (e.g., sorting students by marks).
- Use `Comparator` when you need multiple sorting criteria.
- Use **Lambda functions** or **method references** for shorter, cleaner comparator logic.

---
# TreeSet and LinkedHashSet in Java

## 1. TreeSet in Java

### Introduction
`TreeSet` is a part of the Java Collections Framework and implements the `NavigableSet` interface, which extends `SortedSet`. It is implemented using a **Red-Black Tree** and stores elements in **sorted order**.

### Characteristics
- **Sorted Order**: Maintains elements in ascending order.
- **No Duplicates**: Only unique elements are allowed.
- **Not Thread-Safe**: Must be synchronized externally.
- **Null Elements**: Does not allow null elements.

### TreeSet Methods

| Method | Description |
|--------|-------------|
| `add(E e)` | Adds the specified element to the set. |
| `remove(Object o)` | Removes the specified element if present. |
| `contains(Object o)` | Checks if the set contains a specific element. |
| `size()` | Returns the number of elements in the set. |
| `isEmpty()` | Checks if the set is empty. |
| `clear()` | Removes all elements from the set. |
| `first()` | Returns the first (lowest) element. |
| `last()` | Returns the last (highest) element. |
| `higher(E e)` | Returns the least element strictly greater than the given element. |
| `lower(E e)` | Returns the greatest element strictly less than the given element. |
| `ceiling(E e)` | Returns the least element greater than or equal to the given element. |
| `floor(E e)` | Returns the greatest element less than or equal to the given element. |
| `pollFirst()` | Retrieves and removes the first element. |
| `pollLast()` | Retrieves and removes the last element. |
| `descendingSet()` | Returns a reverse order view of the elements. |

### Example: Using TreeSet
```java
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(3);

        System.out.println("TreeSet: " + treeSet);
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());
        System.out.println("Higher than 3: " + treeSet.higher(3));
        System.out.println("Lower than 10: " + treeSet.lower(10));
    }
}
```
**Output:**
```
TreeSet: [1, 3, 5, 10]
First Element: 1
Last Element: 10
Higher than 3: 5
Lower than 10: 5
```

---

## 2. LinkedHashSet in Java

### Introduction
`LinkedHashSet` is a subclass of `HashSet` and implements the `Set` interface. It maintains insertion order using a **doubly-linked list** running through its elements.

### Characteristics
- **Maintains Insertion Order**: Unlike `HashSet`, elements are returned in the order they were inserted.
- **No Duplicates**: Duplicate elements are not allowed.
- **Allows Null**: Can store one `null` element.

### LinkedHashSet Methods

| Method | Description |
|--------|-------------|
| `add(E e)` | Adds the specified element to the set. |
| `remove(Object o)` | Removes the specified element. |
| `contains(Object o)` | Checks if the set contains a specific element. |
| `size()` | Returns the number of elements in the set. |
| `isEmpty()` | Checks if the set is empty. |
| `clear()` | Removes all elements. |
| `iterator()` | Returns an iterator over the elements in insertion order. |

### Example: Using LinkedHashSet
```java
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Apple"); // Duplicate, won't be added

        System.out.println("LinkedHashSet: " + linkedHashSet);

        linkedHashSet.remove("Banana");
        System.out.println("After removal: " + linkedHashSet);
    }
}
```
**Output:**
```
LinkedHashSet: [Apple, Banana, Cherry]
After removal: [Apple, Cherry]
```

---

## Key Differences: TreeSet vs LinkedHashSet
| Feature | TreeSet | LinkedHashSet |
|---------|--------|--------------|
| **Ordering** | Natural (sorted) order | Insertion order |
| **Implementation** | Red-Black Tree | Hash Table + Linked List |
| **Performance** | O(log n) for operations | O(1) for add, remove, contains |
| **Null Handling** | Does not allow null | Allows one null value |
| **Use Case** | When sorted order is needed | When insertion order is important |

---
## Conclusion
- Use **TreeSet** when you need a **sorted** collection.
- Use **LinkedHashSet** when you need to **preserve insertion order** with quick lookups.

Both collections provide unique advantages and should be chosen based on the requirements of the application.

---
# TreeMap and LinkedHashMap in Java

## 1. TreeMap in Java

### Introduction
`TreeMap` is a part of the Java Collections Framework and implements the `NavigableMap` interface, which extends `SortedMap`. It is implemented using a **Red-Black Tree** and maintains elements in **sorted order based on keys**.

### Characteristics
- **Sorted Order**: Keys are stored in natural order (or a custom comparator can be used).
- **No Duplicates**: Unique keys are required.
- **Not Thread-Safe**: Must be synchronized externally.
- **Allows Null Values**: But does not allow `null` keys.

### TreeMap Methods

| Method | Description |
|--------|-------------|
| `put(K key, V value)` | Inserts a key-value pair into the map. |
| `remove(Object key)` | Removes the mapping for the specified key. |
| `get(Object key)` | Returns the value for the given key. |
| `containsKey(Object key)` | Checks if the map contains a specific key. |
| `containsValue(Object value)` | Checks if the map contains a specific value. |
| `size()` | Returns the number of key-value mappings. |
| `isEmpty()` | Checks if the map is empty. |
| `clear()` | Removes all elements from the map. |
| `firstKey()` | Returns the first (lowest) key. |
| `lastKey()` | Returns the last (highest) key. |
| `higherKey(K key)` | Returns the least key strictly greater than the given key. |
| `lowerKey(K key)` | Returns the greatest key strictly less than the given key. |
| `ceilingKey(K key)` | Returns the least key greater than or equal to the given key. |
| `floorKey(K key)` | Returns the greatest key less than or equal to the given key. |
| `pollFirstEntry()` | Retrieves and removes the first entry. |
| `pollLastEntry()` | Retrieves and removes the last entry. |
| `descendingMap()` | Returns a reverse order view of the keys. |

### Example: Using TreeMap
```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "Apple");
        treeMap.put(1, "Banana");
        treeMap.put(5, "Cherry");
        treeMap.put(2, "Date");

        System.out.println("TreeMap: " + treeMap);
        System.out.println("First Key: " + treeMap.firstKey());
        System.out.println("Last Key: " + treeMap.lastKey());
        System.out.println("Higher Key than 2: " + treeMap.higherKey(2));
        System.out.println("Lower Key than 5: " + treeMap.lowerKey(5));
    }
}
```
**Output:**
```
TreeMap: {1=Banana, 2=Date, 3=Apple, 5=Cherry}
First Key: 1
Last Key: 5
Higher Key than 2: 3
Lower Key than 5: 3
```

---

## 2. LinkedHashMap in Java

### Introduction
`LinkedHashMap` is a subclass of `HashMap` and maintains insertion order using a **doubly-linked list**.

### Characteristics
- **Maintains Insertion Order**: Unlike `HashMap`, elements are returned in the order they were inserted.
- **No Duplicates**: Unique keys are required.
- **Allows Null**: Can store one `null` key and multiple `null` values.
- **Faster Access**: Similar to `HashMap`, operations run in **O(1) time complexity**.

### LinkedHashMap Methods

| Method | Description |
|--------|-------------|
| `put(K key, V value)` | Inserts a key-value pair into the map. |
| `remove(Object key)` | Removes the mapping for the specified key. |
| `get(Object key)` | Returns the value for the given key. |
| `containsKey(Object key)` | Checks if the map contains a specific key. |
| `containsValue(Object value)` | Checks if the map contains a specific value. |
| `size()` | Returns the number of key-value mappings. |
| `isEmpty()` | Checks if the map is empty. |
| `clear()` | Removes all elements. |
| `keySet()` | Returns a `Set` of keys. |
| `values()` | Returns a `Collection` of values. |
| `entrySet()` | Returns a `Set` of key-value pairs. |

### Example: Using LinkedHashMap
```java
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(3, "Apple");
        linkedHashMap.put(1, "Banana");
        linkedHashMap.put(5, "Cherry");
        linkedHashMap.put(2, "Date");

        System.out.println("LinkedHashMap: " + linkedHashMap);
        linkedHashMap.remove(1);
        System.out.println("After removal: " + linkedHashMap);
    }
}
```
**Output:**
```
LinkedHashMap: {3=Apple, 1=Banana, 5=Cherry, 2=Date}
After removal: {3=Apple, 5=Cherry, 2=Date}
```

---

## Key Differences: TreeMap vs LinkedHashMap

| Feature | TreeMap | LinkedHashMap |
|---------|--------|--------------|
| **Ordering** | Sorted by keys | Insertion order |
| **Implementation** | Red-Black Tree | Hash Table + Linked List |
| **Performance** | O(log n) for operations | O(1) for add, remove, contains |
| **Null Handling** | Does not allow null keys | Allows one null key |
| **Use Case** | When sorted keys are needed | When insertion order is important |

---

## Conclusion
- Use **TreeMap** when you need **sorted keys**.
- Use **LinkedHashMap** when you need **preserved insertion order** with quick lookups.

Both collections provide unique advantages and should be chosen based on the application requirements.



