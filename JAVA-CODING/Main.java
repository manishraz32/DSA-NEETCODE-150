import java.lang.reflect.Method;
import java.util.*;

import javax.lang.model.util.Elements;
class Person {
    String name;
    int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " (" + height + ")";
    }
}

class HeightComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p2.height, p1.height); // Descending order
    }
}

public class Main {

   
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("A", "B", "C"));
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("X", "Y", "Z"));
        List<String> vector = new Vector<>(Arrays.asList("1", "2", "3"));
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // System.out.println("ArrayList: " + arrayList);
        // System.out.println("LinkedList: " + linkedList);
        // System.out.println("Vector: " + vector);
        // System.out.println("Stack: " + stack);


        // Set Implementations (Unique Elements, No Duplicates)
        // HashSet (unordered set)
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // Ignored (No duplicates)
        // System.out.println("set: " +  set);

        // LinkedHashSet (Ordered Set)
        Set<Number> linkedSet = new LinkedHashSet<>();
        linkedSet.add(100);
        linkedSet.add(50);
        linkedSet.add(200);
        // System.out.println("linked Set: " +  linkedSet);

        // TreeSet (Sorted Order) // BST
        Set<Number> treeSet = new TreeSet<>();
        treeSet.add(100);
        treeSet.add(50);
        treeSet.add(200);
        // System.out.println("treeSet: " +  treeSet);

        // priority queue
        Queue<Integer> minQueue = new PriorityQueue<>();
        minQueue.add(30);
        minQueue.add(10);
        minQueue.add(20);

        System.out.println(minQueue.poll()); 

        Queue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        maxQueue.add(30);
        maxQueue.add(10);
        maxQueue.add(20);
        System.out.println(maxQueue.poll());

        Queue<Person> maxQueueHeight = new PriorityQueue<>(new HeightComparator());

        maxQueueHeight.add(new Person("Manish", 20));
        maxQueueHeight.add(new Person("Amit", 25));
        maxQueueHeight.add(new Person("Rohit", 18));
        System.out.println("maxQueueHeight: " + maxQueueHeight);

       // HashMap 
       HashMap<Integer, String> map = new HashMap<>();
        // 2. Adding & Updating Elements
        // put(K key, V value)	Adds a key-value pair to the map. If the key exists, it updates the value.
       //  putAll(Map<K, V> m)	Copies all key-value pairs from another map.
       //  putIfAbsent(K key, V value)	Adds the key-value pair only if the key is not already present.
       map.put(1, "Apple");
       map.put(2, "Banana");
       map.putIfAbsent(1, "Cherry");

        // Retrieving Elements
        // get(K key)	Returns the value associated with the key, or null if the key is not found.
        // getOrDefault(K key, V defaultValue)	Returns the value if key exists, otherwise returns the default value.
      System.out.println(map.get(1)); // Apple
      System.out.println(map.getOrDefault(3, "Unknown")); // Unknown

    // 4. Checking for Keys/Values

    // containsKey(K key)	Checks if a key exists.
    // containsValue(V value)	Checks if a value exists.
    // isEmpty()	Returns true if the map has no elements.
    
    // 5. Removing Elements
    // remove(K key)	Removes the key-value pair for the given key.
    // remove(K key, V value)	Removes the entry only if both key and value match.
    // clear()	Removes all entries from the map.

    map.remove(1); // Removes key 1
    map.remove(2, "Banana"); // Removes key 2 only if value is "Banana"
    map.clear(); // Removes everything

    // 6. Iterating Over a HashMap
    // keySet()	Returns a Set of all keys.
    // values()	Returns a Collection of all values.
    // entrySet()	Returns a Set of key-value pairs (Map.Entry<K, V>).

    for (Integer key : map.keySet()) {
        System.out.println("Key: " + key);
    }

    for (String value : map.values()) {
        System.out.println("Value: " + value);
    }

    for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
    

    // ✅ 7. Size and Performance
    // size()	Returns the number of key-value pairs.
    // hashCode()	Returns the hash code for the map.

    System.out.println(map.size()); // 2
    System.out.println(map.hashCode()); // Hash code of the map

    // Method	Description
    // put(K, V), putIfAbsent(K, V)	Adds/updates a key-value pair
    // get(K), getOrDefault(K, V)	Retrieves a value
    // containsKey(K), containsValue(V)	Checks existence
    // remove(K), remove(K, V), clear()	Removes elements
    // size(), isEmpty()	Checks size/status
    // keySet(), values(), entrySet()	Retrieves keys, values, entries
    

    }
}
