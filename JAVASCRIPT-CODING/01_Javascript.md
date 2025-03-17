# JavaScript Methods for Competitive Programming

## 🔹 Array Methods
| Method | Description | Example |
|--------|------------|---------|
| `push()` | Adds element(s) to the end of an array | `arr.push(5);` |
| `pop()` | Removes the last element from an array | `arr.pop();` |
| `shift()` | Removes the first element from an array | `arr.shift();` |
| `unshift()` | Adds element(s) to the beginning of an array | `arr.unshift(1);` |
| `splice(start, deleteCount, item1, item2, …)` | Adds/removes elements at a specific index | `arr.splice(1, 2, 10, 20);` |
| `slice(start, end)` | Returns a portion of an array | `arr.slice(1, 3);` |
| `concat()` | Merges two or more arrays | `arr1.concat(arr2);` |
| `indexOf(value)` | Returns the first index of a value (-1 if not found) | `arr.indexOf(5);` |
| `includes(value)` | Checks if an element exists in an array | `arr.includes(3);` |
| `reverse()` | Reverses an array in place | `arr.reverse();` |
| `sort((a, b) => a - b)` | Sorts an array (default is lexicographic) | `arr.sort((a, b) => a - b);` |
| `filter(callback)` | Creates a new array with elements that pass the test | `arr.filter(num => num > 5);` |
| `map(callback)` | Creates a new array by applying a function to each element | `arr.map(num => num * 2);` |
| `reduce(callback, initialValue)` | Reduces an array to a single value | `arr.reduce((sum, num) => sum + num, 0);` |
| `find(callback)` | Returns the first element that passes a test | `arr.find(x => x > 5);` |
| `findIndex(callback)` | Returns the index of the first element that passes a test | `arr.findIndex(x => x > 5);` |
| `every(callback)` | Checks if all elements pass a test | `arr.every(x => x > 0);` |
| `some(callback)` | Checks if at least one element passes a test | `arr.some(x => x > 5);` |

## 🔹 String Methods
| Method | Description | Example |
|--------|------------|---------|
| `charAt(index)` | Returns the character at a specific index | `'hello'.charAt(1); // 'e'` |
| `concat(str1, str2, …)` | Concatenates strings | `'Hello'.concat(' World');` |
| `includes(substring)` | Checks if a string contains another string | `'JavaScript'.includes('Script');` |
| `slice(start, end)` | Extracts part of a string | `'Hello'.slice(1, 3); // 'el'` |
| `toLowerCase()` | Converts a string to lowercase | `'HELLO'.toLowerCase();` |
| `toUpperCase()` | Converts a string to uppercase | `'hello'.toUpperCase();` |
| `trim()` | Removes whitespace from both ends of a string | `'  hello  '.trim();` |
| `split(separator)` | Splits a string into an array | `'hello world'.split(' ');` |

## 🔹 Number & Math Methods
| Method | Description | Example |
|--------|------------|---------|
| `Math.abs(x)` | Returns the absolute value | `Math.abs(-5); // 5` |
| `Math.ceil(x)` | Rounds up to the nearest integer | `Math.ceil(4.2); // 5` |
| `Math.floor(x)` | Rounds down to the nearest integer | `Math.floor(4.9); // 4` |
| `Math.round(x)` | Rounds to the nearest integer | `Math.round(4.5); // 5` |
| `Math.random()` | Generates a random number between 0 and 1 | `Math.random();` |
| `Math.max(a, b, ...)` | Returns the largest number | `Math.max(5, 10, 15);` |
| `Math.min(a, b, ...)` | Returns the smallest number | `Math.min(5, 10, 15);` |

## 🔹 Object Methods
| Method | Description | Example |
|--------|------------|---------|
| `Object.keys(obj)` | Returns an array of object keys | `Object.keys({a: 1, b: 2});` |
| `Object.values(obj)` | Returns an array of object values | `Object.values({a: 1, b: 2});` |
| `Object.entries(obj)` | Returns an array of `[key, value]` pairs | `Object.entries({a: 1, b: 2});` |
| `Object.assign(target, source)` | Copies properties from one object to another | `Object.assign({}, obj1, obj2);` |
| `Object.freeze(obj)` | Prevents modifications to an object | `Object.freeze(myObj);` |
| `Object.seal(obj)` | Prevents adding/removing properties but allows modification | `Object.seal(myObj);` |

## 🔹 Performance & Misc Methods
| Method | Description | Example |
|--------|------------|---------|
| `console.log(value)` | Logs a value to the console | `console.log('Hello');` |
| `console.time(label)` | Starts a timer | `console.time('test');` |
| `console.timeEnd(label)` | Ends the timer and logs the time elapsed | `console.timeEnd('test');` |
| `setTimeout(fn, ms)` | Delays execution of a function | `setTimeout(() => console.log('Hello'), 1000);` |
| `setInterval(fn, ms)` | Repeats execution of a function | `setInterval(() => console.log('Hi'), 1000);` |
| `clearTimeout(id)` | Cancels a timeout | `clearTimeout(timeoutId);` |
| `clearInterval(id)` | Cancels an interval | `clearInterval(intervalId);` |
| `Date.now()` | Returns the current timestamp | `Date.now();` |
| `new Date().toISOString()` | Returns the current date in ISO format | `new Date().toISOString();` |

---
# JavaScript Object Methods

## 🔹 Object Methods and Examples

| Method | Description | Example |
|--------|------------|---------|
| `Object.keys(obj)` | Returns an array of object keys | `Object.keys({a: 1, b: 2}); // ['a', 'b']` |
| `Object.values(obj)` | Returns an array of object values | `Object.values({a: 1, b: 2}); // [1, 2]` |
| `Object.entries(obj)` | Returns an array of `[key, value]` pairs | `Object.entries({a: 1, b: 2}); // [['a', 1], ['b', 2]]` |
| `Object.assign(target, source)` | Copies properties from one object to another | `Object.assign({}, {a: 1}, {b: 2}); // {a: 1, b: 2}` |
| `Object.create(proto, propertiesObject)` | Creates a new object with the specified prototype | `const obj = Object.create({x: 10}); console.log(obj.x); // 10` |
| `Object.freeze(obj)` | Prevents modifications to an object | `const obj = {a: 1}; Object.freeze(obj); obj.a = 2; // No effect` |
| `Object.seal(obj)` | Prevents adding/removing properties but allows modification | `const obj = {a: 1}; Object.seal(obj); obj.a = 2; // Works, but can't add new keys` |
| `Object.getPrototypeOf(obj)` | Returns the prototype of an object | `Object.getPrototypeOf([]); // Array.prototype` |
| `Object.setPrototypeOf(obj, proto)` | Sets the prototype of an object | `const obj = {}; Object.setPrototypeOf(obj, Array.prototype);` |
| `Object.hasOwn(obj, prop)` | Checks if an object has a property (ES2022) | `Object.hasOwn({a: 1}, 'a'); // true` |
| `Object.hasOwnProperty(prop)` | Checks if an object has a property | `({a: 1}).hasOwnProperty('a'); // true` |
| `Object.is(value1, value2)` | Compares values like `===`, but treats `NaN` correctly | `Object.is(NaN, NaN); // true` |
| `Object.defineProperty(obj, prop, descriptor)` | Adds or modifies a property with descriptors | `Object.defineProperty(obj, 'key', {value: 10, writable: false});` |
| `Object.defineProperties(obj, props)` | Defines multiple properties at once | `Object.defineProperties(obj, {key1: {value: 10}, key2: {value: 20}});` |
| `Object.getOwnPropertyDescriptor(obj, prop)` | Gets a property descriptor | `Object.getOwnPropertyDescriptor({a: 1}, 'a');` |
| `Object.getOwnPropertyDescriptors(obj)` | Gets all property descriptors | `Object.getOwnPropertyDescriptors({a: 1});` |
| `Object.getOwnPropertyNames(obj)` | Returns an array of all property names (including non-enumerable) | `Object.getOwnPropertyNames({a: 1, b: 2}); // ['a', 'b']` |
| `Object.getOwnPropertySymbols(obj)` | Returns an array of symbol properties | `const sym = Symbol('x'); const obj = {[sym]: 10}; Object.getOwnPropertySymbols(obj);` |
| `Object.fromEntries(entries)` | Creates an object from key-value pairs | `Object.fromEntries([['a', 1], ['b', 2]]); // {a: 1, b: 2}` |

## 🔹 String Methods

| Method | Description | Example |
|--------|------------|---------|
| `replace(searchValue, newValue)` | Replaces the first occurrence of a substring | `'hello world'.replace('world', 'JavaScript'); // 'hello JavaScript'` |
| `replaceAll(searchValue, newValue)` | Replaces all occurrences of a substring | `'hello world world'.replaceAll('world', 'JavaScript'); // 'hello JavaScript JavaScript'` |
| `substring(start, end)` | Extracts a part of a string | `'hello world'.substring(0, 5); // 'hello'` |

---
# JavaScript Array Methods

JavaScript provides various built-in methods to manipulate and work with arrays efficiently. Below are some commonly used array methods with examples.

## 1. `push()` - Add Elements to the End
Adds one or more elements to the end of an array.

```js
let arr = [1, 2, 3];
arr.push(4, 5);
console.log(arr); // [1, 2, 3, 4, 5]
```

## 2. `pop()` - Remove Last Element
Removes and returns the last element from an array.

```js
let arr = [1, 2, 3];
let removed = arr.pop();
console.log(arr); // [1, 2]
console.log(removed); // 3
```

## 3. `shift()` - Remove First Element
Removes and returns the first element of an array.

```js
let arr = [1, 2, 3];
let removed = arr.shift();
console.log(arr); // [2, 3]
console.log(removed); // 1
```

## 4. `unshift()` - Add Elements to the Beginning
Adds one or more elements to the beginning of an array.

```js
let arr = [2, 3];
arr.unshift(0, 1);
console.log(arr); // [0, 1, 2, 3]
```

## 5. `concat()` - Merge Arrays
Creates a new array by merging two or more arrays.

```js
let arr1 = [1, 2];
let arr2 = [3, 4];
let merged = arr1.concat(arr2);
console.log(merged); // [1, 2, 3, 4]
```

## 6. `slice()` - Extract a Portion of an Array
Returns a shallow copy of a portion of an array without modifying the original array.

```js
let arr = [1, 2, 3, 4, 5];
let sliced = arr.slice(1, 4);
console.log(sliced); // [2, 3, 4]
console.log(arr); // [1, 2, 3, 4, 5]
```

## 7. `splice()` - Add/Remove Elements
Modifies the original array by adding/removing elements.

```js
let arr = [1, 2, 3, 5];
arr.splice(3, 0, 4); // Insert 4 at index 3
console.log(arr); // [1, 2, 3, 4, 5]

arr.splice(1, 2); // Remove 2 elements from index 1
console.log(arr); // [1, 4, 5]
```

## 8. `indexOf()` - Find Index of an Element
Returns the first index of a specified element, or `-1` if not found.

```js
let arr = [10, 20, 30, 40];
console.log(arr.indexOf(30)); // 2
console.log(arr.indexOf(50)); // -1
```

## 9. `includes()` - Check if an Array Contains an Element
Returns `true` if the array contains the specified element, otherwise `false`.

```js
let arr = [1, 2, 3];
console.log(arr.includes(2)); // true
console.log(arr.includes(5)); // false
```

## 10. `forEach()` - Iterate Over an Array
Executes a function for each array element.

```js
let arr = [1, 2, 3];
arr.forEach(num => console.log(num * 2));
// Output: 2, 4, 6
```

## 11. `map()` - Transform Each Element
Creates a new array by applying a function to each element.

```js
let arr = [1, 2, 3];
let doubled = arr.map(num => num * 2);
console.log(doubled); // [2, 4, 6]
```

## 12. `filter()` - Filter Elements
Creates a new array with elements that satisfy a condition.

```js
let arr = [10, 20, 30, 40];
let filtered = arr.filter(num => num > 20);
console.log(filtered); // [30, 40]
```

## 13. `reduce()` - Accumulate Values
Reduces an array to a single value.

```js
let arr = [1, 2, 3, 4];
let sum = arr.reduce((acc, num) => acc + num, 0);
console.log(sum); // 10
```

## 14. `sort()` - Sort an Array
Sorts an array in ascending order (by default it sorts alphabetically).

```js
let arr = [30, 10, 50, 20];
arr.sort((a, b) => a - b);
console.log(arr); // [10, 20, 30, 50]
```

## 15. `reverse()` - Reverse an Array
Reverses the order of elements in an array.

```js
let arr = [1, 2, 3, 4];
arr.reverse();
console.log(arr); // [4, 3, 2, 1]
```

## Conclusion
These are some of the most commonly used array methods in JavaScript. Understanding and using these methods effectively can help you write cleaner and more efficient code.





