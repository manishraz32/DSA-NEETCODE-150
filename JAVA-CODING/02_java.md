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


