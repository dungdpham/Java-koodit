public class CoffeeMaker {
    private boolean onStatus;
    private String type;
    private int amount;

    public CoffeeMaker() {
        onStatus = false;
        type = "normal";
    }

    public boolean isOn() {
        return onStatus;
    }

    public void pressOnOff() {
        onStatus = !onStatus;
    }

    public String getType() {
        return type;
    }

    public void setType() {
        if (onStatus) {
            if (type.equals("normal")) {
                type = "espresso";
            } else {
                type = "normal";
            }
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (onStatus) {
            if (amount >= 10 && amount <= 80) {
                this.amount = amount;
            }
        }
    }
}
