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

