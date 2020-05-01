package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        primaryStage.setTitle("Restaurant");
        primaryStage.setScene(new Scene(root, 650, 500));
        primaryStage.show();
        menu m = new menu();
        Item item = new Item("chicken",Float.valueOf(60),"very tasty chicken");
        m.addItem(item);
        //System.out.println(m.get_item(10).getName());


    }


    public static void main(String[] args) {
        launch(args);
    }

}
