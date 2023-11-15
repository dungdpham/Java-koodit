public class SportsCar extends Car {
    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 30;
            gasolineLevel = Math.max(0, gasolineLevel - 15);
        } else {
            speed = 0;
        }
    }

    @Override
    public void decelerate() {
        if (gasolineLevel > 0) {
            speed = Math.max(0, speed - 20);
            gasolineLevel = Math.max(0, gasolineLevel - 10);
        } else {
            speed = 0;
        }
    }
}
