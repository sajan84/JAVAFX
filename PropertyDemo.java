

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.paint.*;

public class PropertyDemo extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button b=new Button("Click _Me");
        b.setTextFill(Color.BLUE);
        b.setMnemonicParsing(true);//which having underscore that is made Mnemonics in this _click me is Mnemonics
        Tooltip tp=new Tooltip("Click this button to save a data");
        b.setTooltip(tp);
        b.setStyle("-fx-border-color:black;-fx-background-color:yellow;");
        Alert a=new Alert(Alert.AlertType.INFORMATION,"Button is Clicked");
        b.setOnAction(e->a.show());

        FlowPane fp=new FlowPane(b);
//        fp.getChildren().add(b);

        Scene sc=new Scene(fp,400,400);
        stage.setScene(sc);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);


    }


}
