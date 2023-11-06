public class Car {
    private float speed;
    private float gasolineLevel;
    private String typeName;
    private float tankCapacity;
    private float topSpeed;

    private boolean cruiseControlOn;
    private float cruiseControlSpeed;
    private float minCruiseSpeed;
    private float maxCruiseSpeed;

    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;

        cruiseControlOn = false;
        minCruiseSpeed = 30;
        maxCruiseSpeed = 120;
    }

    public Car(String typeName, float tankCapacity, float topSpeed) {
        this(typeName);
        this.tankCapacity = tankCapacity;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed = Math.min(speed + 10, topSpeed);
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    float getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }
    public float getTankCapacity() {
        return tankCapacity;
    }
    public float getTopSpeed() {
        return topSpeed;
    }

    public float getCruiseControlSpeed() {
        return cruiseControlSpeed;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    public void setCruiseControlSpeed(float targetSpeed) {
        if (targetSpeed < minCruiseSpeed || targetSpeed > maxCruiseSpeed) {
            cruiseControlSpeed = 0;
        } else {
            cruiseControlSpeed = targetSpeed;
        }
    }

    public void turnOnCruiseControl() {
        if (cruiseControlSpeed == 0) {
            cruiseControlOn = false;
            System.out.println("Cruise Control Speed cannot be set. Cruise Control: Off.");
        } else if (speed == cruiseControlSpeed) {
            cruiseControlOn = true;
            System.out.println("Cruise Control: On. Target speed: " + cruiseControlSpeed + " km/h. Current speed: " + speed + " km/h.");
        } else {
            while (speed != cruiseControlSpeed) {
                cruiseControlOn = true;
                System.out.print("Cruise Control: On. ");
                if (speed > cruiseControlSpeed) {
                    decelerate((int) (speed - cruiseControlSpeed));
                    System.out.print("Auto decelerating... ");
                } else {
                    accelerate();
                    System.out.print("Auto accelerating... ");
                }
                System.out.println("Target speed: " + cruiseControlSpeed + " km/h. Current speed: " + speed + " km/h.");
            }
        }
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }
}