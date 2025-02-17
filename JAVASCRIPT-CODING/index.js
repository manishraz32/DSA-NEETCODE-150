// JAVA CODING

// 1. creating a map
const map = new Map();
const map1 = new Map([
  ["name", "John"],
  ["age", 30],
  ["city", "New York"],
]);

// 2. methods
// 1. Adding & Updating Elements
// set(key, value) Adds or updates a key-value pair.

map.set("name", "Alice");
map.set("age", 25);
map.set("age", 30); // Updates existing key
console.log(map);
// Map { 'name' => 'Alice', 'age' => 30 }

// 2. Retrieving Elements
console.log(map.get("name")); // Alice
console.log(map.get("gender")); // undefined

//3. Checking for Keys
// has(key)	Returns true if the key exists, otherwise false.
console.log(map.has("age")); // true
console.log(map.has("salary")); // false

// 4. Removing Elements
// delete(key)	Removes the key-value pair for the given key. Returns true if key existed, otherwise false.
// clear()	Removes all key-value pairs.

map.delete("age"); // Removes 'age' key
console.log(map.has("age")); // false

map.clear(); // Clears all elements
console.log(map.size); // 0

// 5. Getting Map Size
// size	Returns the number of key-value pairs.
console.log(map.size); // 2

// 6. Iterating Over a Map
// keys()	Returns an iterator with all keys.
// values()	Returns an iterator with all values.
// entries()	Returns an iterator with [key, value] pairs.
// forEach(callback)	Iterates through each key-value pair.

map.set("name", "Alice");
map.set("age", 30);

// Iterating keys
for (let key of map.keys()) {
  console.log(key); // name, age
}

// Iterating values
for (let value of map.values()) {
  console.log(value); // Alice, 30
}

// Iterating key-value pairs
for (let [key, value] of map.entries()) {
  console.log(key, value); // name Alice, age 30
}

// Using forEach
map.forEach((value, key) => {
  console.log(`${key}: ${value}`);
});

// 7. Converting Map to Other Data Types
// Array.from(map)	Converts the Map to an array of [key, value] pairs.
// Object.fromEntries(map)	Converts the Map to a plain object.

const mapArray = Array.from(map);
console.log(mapArray); 
// [['name', 'Alice'], ['age', 30]]

const obj = Object.fromEntries(map);
console.log(obj);
// { name: 'Alice', age: 30 }
