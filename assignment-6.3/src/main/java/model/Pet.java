package model;

public class Pet {
    private double petX;
    private double petY;
    private double targetX;
    private double targetY;
    private boolean isMouseExited;

    public double getPetX() {
        return petX;
    }

    public void setPetX(double petX) {
        this.petX = petX;
    }

    public double getPetY() {
        return petY;
    }

    public void setPetY(double petY) {
        this.petY = petY;
    }

    public double getTargetX() {
        return targetX;
    }

    public void setTargetX(double targetX) {
        this.targetX = targetX;
    }

    public double getTargetY() {
        return targetY;
    }

    public void setTargetY(double targetY) {
        this.targetY = targetY;
    }

    public boolean isMouseExited() {
        return isMouseExited;
    }

    public void setMouseExited(boolean mouseExited) {
        isMouseExited = mouseExited;
    }
}
