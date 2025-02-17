import java.lang.reflect.Method;
import java.util.*;
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


    }
}
