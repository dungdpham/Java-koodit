public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");

        private String color;

        Color(String color) {
            this.color = color;
        }

        @Override public String toString() {
            return color;
        }
    }

    private Color currentColor;
    private boolean isCapOn;

    public Pen() {
        this.currentColor = Color.RED;
        this.isCapOn = true;
    }

    public Pen(Color color) {
        this.currentColor = color;
        this.isCapOn = true;
    }

    public String draw() {
        if (isCapOn) {
            return "";
        } else {
            return "Drawing " + currentColor.toString();
        }
    }

    public void capOff() {
        isCapOn = false;
    }

    public void capOn() {
        isCapOn = true;
    }

    public void changeColor(Color newColor) {
        if (isCapOn) {
            currentColor = newColor;
        }
    }
}

