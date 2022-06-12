package com.toba.javafxapplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import java.io.File;
import java.util.List;
public class Controller {
    @FXML
    private Label label;
    @FXML
    private Button button4;

    public void initialize() {
        button4.setEffect(new DropShadow());
    }
    @FXML
    private GridPane gridPane;
    @FXML
    public void handleMouseEnter() {
        label.setScaleX(2.0);
        label.setScaleY(2.0);
    }
    @FXML
    public void handleMouseExit() {
        label.setScaleX(1.0);
        label.setScaleY(1.0);
    }
    @FXML
    public void handleClick() {
        FileChooser chooser = new FileChooser();
//       chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text", "*.txt"),
                new FileChooser.ExtensionFilter("All Files", "*.*"),
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
                new FileChooser.ExtensionFilter("Zip Files", "*.zip"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf")
        );
        List<File> file = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());
        if (file != null) {
            for (int i = 0; i < file.size(); i++) {
                System.out.println(file.get(i));
            }
//           System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was cancelled");
        }
    }
    @FXML
    public void handleLinkClick() {
        System.out.println("The link was clicked");
    }
}