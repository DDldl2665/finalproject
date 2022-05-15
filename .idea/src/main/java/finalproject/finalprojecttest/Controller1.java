package finalproject.finalprojecttest;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.io.IOException;
import java.util.Objects;
/**
 開始畫面
 */
public class Controller1 {
    DataHolder data = DataHolder.get();


    @FXML
    Label label = new Label();
    @FXML
    Button bt1 = new Button();
    @FXML
    public void display(ActionEvent e) throws IOException {
        System.out.print(data.pos);
        label.setVisible(false);
        bt1.setVisible(false);
        Parent f2 = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("f2.fxml")));
        Scene F2Scene = new Scene(f2);
        F2Scene.getRoot().requestFocus();
        FP.currentStage.setScene(F2Scene);
    }

}
