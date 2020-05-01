package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController
{
   @FXML
    private TextField username;
   @FXML
   private PasswordField password;
   @FXML
    private Button loginbut;

   private String adminName = "admin",adminPass = "admin";

   public void login(ActionEvent event) throws IOException {
           String user_name = username.getText().toString();

        if(user_name.equals(adminName) && password.getText().equals("admin"))
        {
           // System.out.println("yes");
            Parent adminview = FXMLLoader.load(getClass().getResource("admin.fxml"));
            Scene adminscene = new Scene(adminview);
            Stage window = (Stage)( (Node)event.getSource() ).getScene().getWindow();

            window.setScene(adminscene);
            window.show();

        }
       // else System.out.println("no");

   }


    public void newclinet_but(ActionEvent event) throws IOException
    {
        System.out.println("newbut is clicked");
        Parent adminview = FXMLLoader.load(getClass().getResource("client.fxml"));
        Scene adminscene = new Scene(adminview);
        Stage window = (Stage)( (Node)event.getSource() ).getScene().getWindow();

        window.setScene(adminscene);
        window.show();


    }


}
