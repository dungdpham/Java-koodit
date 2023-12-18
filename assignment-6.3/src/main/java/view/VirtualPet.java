package view;

import controller.PetController;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.Pet;

public class VirtualPet extends Application {
    private static final double PET_SPEED = 3.0;

    @Override
    public void start(Stage stage) {
        Pet model = new Pet();
        PetView view = new PetView();
        PetController controller = new PetController(model, view);

        StackPane root = new StackPane();
        root.getChildren().add(view.getCanvas());

        Scene scene = new Scene(root, 400, 400);
        scene.setOnMouseMoved(event -> controller.handleMouseMoved(event));
        scene.setOnMouseExited(event -> controller.handleMouseExited());
        scene.setOnMouseEntered(event -> controller.handleMouseEntered());

        stage.setTitle("Virtual Pet");
        stage.setScene(scene);
        stage.show();

        startPetAnimation(controller);
    }

    private void startPetAnimation(PetController controller) {
        new AnimationTimer() {
            @Override
            public void handle(long now) {
                controller.movePetTowardsMouse(PET_SPEED);
                drawPet(controller.getModel(), controller.getView());
            }
        }.start();
    }

    private void drawPet(Pet model, PetView view) {
        GraphicsContext gc = view.getCanvas().getGraphicsContext2D();
        gc.clearRect(0, 0, view.getCanvas().getWidth(), view.getCanvas().getHeight());
        gc.drawImage(view.getPetImage(), model.getPetX(), model.getPetY());
    }

    public static void main(String[] args) {
        launch(args);
    }
}