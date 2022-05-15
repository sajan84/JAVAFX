


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button b=new Button("Click me");//leaf control
        FlowPane fp=new FlowPane();//parent control
        fp.getChildren().add(b);
        Scene sc=new Scene(fp );
        stage.setScene(sc);
        stage.show();
    }


    public static void main(String[] args) {
    launch(args);
    }


}
