package view;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;

public class PetView {
    private static final String PET_IMAGE_PATH = "pet.png";

    private Canvas canvas;
    private Image petImage;

    public PetView() {
            this.canvas = new Canvas(400, 400);
            this.petImage = new Image(PET_IMAGE_PATH, 20, 20, false, false);
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public Image getPetImage() {
        return petImage;
    }
}
