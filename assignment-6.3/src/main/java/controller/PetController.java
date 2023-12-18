package controller;

import javafx.scene.input.MouseEvent;
import model.Pet;
import view.PetView;

public class PetController {
    private Pet model;
    private PetView view;

    public PetController(Pet model, PetView view) {
        this.model = model;
        this.view = view;
    }

    public void handleMouseMoved(MouseEvent event) {
        if (!model.isMouseExited()) {
            model.setTargetX(event.getX());
            model.setTargetY(event.getY());
        }
    }

    public void handleMouseExited() {
        model.setMouseExited(true);
    }

    public void handleMouseEntered() {
        model.setMouseExited(false);
    }

    public void movePetTowardsMouse(double petSpeed) {
        if (!model.isMouseExited()) {
            double petX = model.getPetX();
            double petY = model.getPetY();
            double targetX = model.getTargetX();
            double targetY = model.getTargetY();

            double angle = Math.atan2(targetY - petY, targetX - petX);
            double deltaX = petSpeed * Math.cos(angle);
            double deltaY = petSpeed * Math.sin(angle);

            if (Math.abs(petX - targetX) > petSpeed || Math.abs(petY - targetY) > petSpeed) {
                model.setPetX(petX + deltaX);
                model.setPetY(petY + deltaY);
            }
        }
    }

    public Pet getModel() {
        return model;
    }

    public PetView getView() {
        return view;
    }
}
