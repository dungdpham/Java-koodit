public class Car {
    protected float speed;
    protected float gasolineLevel;
    private String typeName;

    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
    }

    public float getSpeed() {
        return speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public float getGasolineLevel() {
        return gasolineLevel;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 10;
            gasolineLevel = Math.max(0, gasolineLevel - 5);
        } else {
            speed = 0;
        }
    }

    public void decelerate() {
        if (gasolineLevel > 0) {
            speed = Math.max(0, speed - 10);
            gasolineLevel = Math.max(0, gasolineLevel - 5);
        } else {
            speed = 0;
        }
    }

    public void fillTank() {
        gasolineLevel = 100;
    }
}
