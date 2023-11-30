The following "Calculator" class has the ability to sum positive integers. A negative integer throws an exception.

```
public class Calculator {
    private int currentValue;

    // Method to reset the calculator to zero
    public void reset() { currentValue = 0; }

    // Method to add an integer to the calculator
    public void add(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Negative integers are not allowed.");
        }
        currentValue += value;
    }

    // Method to return the current value of the calculator
    public int getCurrentValue() { return currentValue; }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.reset();
        calculator.add(5);
        System.out.println("Sum: " + calculator.getCurrentValue());

        calculator.add(-8);
        System.out.println("Sum: " + calculator.getCurrentValue());
    }
}
```

This "Calculator" class in Java is designed for summing positive integers while preventing the addition of negative
integers. Key components include:

- **`private int currentValue`**: Represents the current sum.

- **`public void reset()`**: Resets the calculator to zero.

- **`public void add(int value)`**: Adds a positive integer to the sum; throws an exception for negative integers.

- **`public int getCurrentValue()`**: Retrieves the current sum.

In the example usage, the calculator is reset, and a positive integer (5) is added successfully. However, attempting to
add a negative integer (-8) results in the IllegalArgumentException being thrown, emphasizing the class's restriction
against negative integers.

