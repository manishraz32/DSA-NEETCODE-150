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

## 🔹 String Methods
| Method | Description | Example |
|--------|------------|---------|
| `charAt(index)` | Returns the character at a specific index | `'hello'.charAt(1); // 'e'` |
| `concat(str1, str2, …)` | Concatenates strings | `'Hello'.concat(' World');` |
| `includes(substring)` | Checks if a string contains another string | `'JavaScript'.includes('Script');` |
| `slice(start, end)` | Extracts part of a string | `'Hello'.slice(1, 3); // 'el'` |
| `toLowerCase()` | Converts a string to lowercase | `'HELLO'.toLowerCase();` |
| `toUpperCase()` | Converts a string to uppercase | `'hello'.toUpperCase();` |

## 🔹 Number & Math Methods
| Method | Description | Example |
|--------|------------|---------|
| `Math.abs(x)` | Returns the absolute value | `Math.abs(-5); // 5` |
| `Math.ceil(x)` | Rounds up to the nearest integer | `Math.ceil(4.2); // 5` |
| `Math.floor(x)` | Rounds down to the nearest integer | `Math.floor(4.9); // 4` |
| `Math.round(x)` | Rounds to the nearest integer | `Math.round(4.5); // 5` |
| `Math.random()` | Generates a random number between 0 and 1 | `Math.random();` |

## 🔹 Object Methods
| Method | Description | Example |
|--------|------------|---------|
| `Object.keys(obj)` | Returns an array of object keys | `Object.keys({a: 1, b: 2});` |
| `Object.values(obj)` | Returns an array of object values | `Object.values({a: 1, b: 2});` |
| `Object.entries(obj)` | Returns an array of `[key, value]` pairs | `Object.entries({a: 1, b: 2});` |
| `Object.assign(target, source)` | Copies properties from one object to another | `Object.assign({}, obj1, obj2);` |

## 🔹 Performance & Misc Methods
| Method | Description | Example |
|--------|------------|---------|
| `console.log(value)` | Logs a value to the console | `console.log('Hello');` |
| `console.time(label)` | Starts a timer | `console.time('test');` |
| `console.timeEnd(label)` | Ends the timer and logs the time elapsed | `console.timeEnd('test');` |
| `setTimeout(fn, ms)` | Delays execution of a function | `setTimeout(() => console.log('Hello'), 1000);` |
| `setInterval(fn, ms)` | Repeats execution of a function | `setInterval(() => console.log('Hi'), 1000);` |

These methods are crucial for **competitive programming** because they help with **fast operations, memory optimization, and concise code writing**. 🚀💡 Let me know if you need a **detailed example** for any of these methods! 😃

