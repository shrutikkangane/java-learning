# Time & Space Complexity

Time and Space Complexity are used to analyze the efficiency of an algorithm.

---

## 1. O(1) - Constant Time

The operation takes the same amount of time regardless of the input size.

### Example

```java
public class ConstantTime {
    public static void main(String[] args) {

        int n = 10;

        System.out.println(n);
    }
}
```

### Analysis

Only one operation is performed.

**Time Complexity:** `O(1)`

**Space Complexity:** `O(1)`

---

## 2. O(n) - Linear Time

The number of operations grows linearly with the input size.

### Example

```java
public class LinearTime {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
```

### Analysis

The loop runs `n` times.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(1)`

---

## 3. O(n²) - Quadratic Time

A nested loop that depends on `n` usually results in quadratic complexity.

### Example

```java
public class QuadraticTime {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
```

### Analysis

The outer loop runs `n` times.

For every iteration of the outer loop, the inner loop also runs `n` times.

Therefore:

`n × n = n²`

**Time Complexity:** `O(n²)`

**Space Complexity:** `O(1)`

---

## 4. Two Separate Loops

Two loops running one after another are added.

### Example

```java
public class TwoLoops {
    public static void main(String[] args) {

        int n = 10;

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
```

### Analysis

First loop:

`O(n)`

Second loop:

`O(n)`

Total:

`O(n) + O(n) = O(2n)`

We ignore constants.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(1)`

---

## 5. O(log n) - Logarithmic Time

The input size is repeatedly reduced, usually by dividing it.

### Example

```java
public class LogarithmicTime {
    public static void main(String[] args) {

        int n = 16;

        for (int i = 1; i < n; i = i * 2) {
            System.out.println(i);
        }
    }
}
```

### Analysis

The value of `i` doubles each time:

```text
1 → 2 → 4 → 8 → 16
```

The number of iterations grows logarithmically.

**Time Complexity:** `O(log n)`

**Space Complexity:** `O(1)`

---

## 6. O(n log n)

This complexity commonly appears in efficient sorting algorithms.

### Example

```java
public class NLogN {
    public static void main(String[] args) {

        int n = 8;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n; j = j * 2) {
                System.out.println(i + " " + j);
            }
        }
    }
}
```

### Analysis

Outer loop:

`O(n)`

Inner loop:

`O(log n)`

Therefore:

`O(n × log n)`

**Time Complexity:** `O(n log n)`

**Space Complexity:** `O(1)`

---

# Space Complexity

Space complexity measures the extra memory used by an algorithm.

---

## 7. O(1) Space

Only a fixed number of variables are used.

### Example

```java
public class ConstantSpace {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int sum = a + b;

        System.out.println(sum);
    }
}
```

### Analysis

Only a few variables are created regardless of input size.

**Space Complexity:** `O(1)`

---

## 8. O(n) Space

Memory grows with the input size.

### Example

```java
public class LinearSpace {
    public static void main(String[] args) {

        int n = 5;

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = i;
        }
    }
}
```

### Analysis

An array of size `n` is created.

**Space Complexity:** `O(n)`

The loop itself does not require additional growing memory.

**Time Complexity:** `O(n)`

---

# Quick Reference

| Complexity | Name | Example |
|---|---|---|
| `O(1)` | Constant | Direct access |
| `O(log n)` | Logarithmic | Repeated division |
| `O(n)` | Linear | Single loop |
| `O(n log n)` | Linearithmic | Efficient sorting |
| `O(n²)` | Quadratic | Nested loops |
| `O(2ⁿ)` | Exponential | Some recursive algorithms |

---

# Important Rules

### Rule 1 - Ignore Constants

```text
O(2n) → O(n)
O(5n) → O(n)
O(100n) → O(n)
```

### Rule 2 - Keep the Dominant Term

```text
O(n² + n) → O(n²)
O(n³ + n² + n) → O(n³)
```

### Rule 3 - Separate Loops Are Added

```text
O(n) + O(n) = O(2n) = O(n)
```

### Rule 4 - Nested Loops Are Multiplied

```text
O(n) × O(n) = O(n²)
```

### Rule 5 - Analyze the Worst Case

When discussing Big-O, we generally focus on the upper-bound growth of
the algorithm, commonly using the worst-case scenario.

---

# Practice

Try to determine the Time Complexity before checking the answer.

## Question 1

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

**Answer:** `O(n)`

---

## Question 2

```java
for (int i = 0; i < n; i++) {

    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

**Answer:** `O(n²)`

---

## Question 3

```java
for (int i = 1; i < n; i = i * 2) {
    System.out.println(i);
}
```

**Answer:** `O(log n)`

---

## Question 4

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}

for (int j = 0; j < n; j++) {
    System.out.println(j);
}
```

**Answer:** `O(n)`

---

## Question 5

```java
int[] arr = new int[n];

for (int i = 0; i < n; i++) {
    arr[i] = i;
}
```

**Time Complexity:** `O(n)`

**Space Complexity:** `O(n)`

---

# Key Takeaway

The goal of Time & Space Complexity is not to memorize complexity values.

The goal is to look at an algorithm and understand how its:

- Number of operations changes with input size
- Memory usage changes with input size

This skill will be used throughout the DSA topics in this repository.