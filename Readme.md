# Functional Programming in Java

Functional Programming (FP) is a programming paradigm where software is built by **composing pure functions** and avoiding **shared state, mutable data, and side effects**. This approach promotes cleaner, more predictable, and maintainable code.

---

## Key Concepts

### Functions as First-Class Citizens
In FP, functions are treated like any other variable:
- You can **pass functions as arguments**  
- **Return functions** from methods  
- **Store functions** in variables using **lambdas** and **functional interfaces**

### Immutability
- Avoid changing state  
- Instead of modifying existing data, **create new values**

### Pure Functions
- A function that **always returns the same output for the same input**  
- **No side effects** (does not modify external state)

### Higher-Order Functions
- Functions that **take other functions as parameters** or **return functions**

---

## Benefits of Functional Programming
- **Concise and Readable Code** – Lambdas and streams reduce boilerplate and clarify intent  
- **Immutability** – Makes code safer and easier to reason about  
- **Reusability** – Behavior parameterization allows writing flexible, reusable methods

---

## Streams in Java
A **Stream** is a sequence of elements (like a pipeline) that allows **functional, declarative processing** of data.  
Unlike collections, streams **do not store data**; they operate on existing collections.

### Types of Stream Operations

**Intermediate (returns a new stream):**
- `filter()` → keep matching elements  
- `map()` → transform elements  
- `sorted()` → sort elements  
- `distinct()` → remove duplicates  

**Terminal (end the stream, produce a result):**
- `collect()` → convert to `List`, `Set`, or `Map`  
- `reduce()` → combine to a single value  
- `forEach()` → iterate elements  
- `count()` → count elements  
- `anyMatch()`, `allMatch()`, `noneMatch()`

### Example of Stream Operations
```java
List<String> names = List.of("Alice", "Bob", "Ankit", "Charlie");
List<String> result = names.stream()
    .filter(n -> n.startsWith("A"))  // Lambda
    .map(String::toUpperCase)        // Method reference
    .toList(); 
```

## Functional Interfaces

Functional Interfaces are interfaces with **exactly one abstract method**, making them ideal for **lambda expressions**.

| Interface        | Purpose                 | Input → Output           |
|-----------------|------------------------|-------------------------|
| `Predicate<T>`   | Condition checking      | 1 argument → boolean    |
| `Function<T,R>`  | Data transformation     | 1 argument → result     |
| `Consumer<T>`    | Performing action       | 1 argument → void       |
| `Supplier<T>`    | Providing value         | 0 arguments → result    |

---

## Behaviour Parameterization

Behaviour Parameterization is the practice of **writing methods that accept behavior (functions) as parameters**, instead of hardcoding the logic.  
- Instead of only passing data into methods, you **also pass what to do with that data (the behavior)**.  
- This makes methods **reusable and flexible**.

### Example:

```java
import java.util.List;
import java.util.function.Predicate;

public class BehaviourExample {
    public static void main(String[] args) {
        List<Integer> num = List.of(6, 3, 4, 7);

        // Filter even numbers
        filterAndPrint(num, x -> x % 2 == 0);

        // Filter odd numbers
        filterAndPrint(num, x -> x % 2 != 0);
    }

    private static void filterAndPrint(List<Integer> num, Predicate<Integer> predicate) {
        num.stream()
           .filter(predicate)
           .forEach(System.out::println);
    }
}
```