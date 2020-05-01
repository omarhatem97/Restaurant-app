package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


//Admin but named omar 3sahn konna bngarrab ed7ak yad
public class admin implements Initializable
{

    @FXML
    private ListView adminlist;
    @FXML
    private TextField itemname;
    @FXML
    private TextField itemprice;
    @FXML
    private TextField itemquantity;
    @FXML private TextField itemdesc;





    public void update_menu()
    {
        menu m  = source.m  ;
        for (int i = 0; i < m.get_size(); i++) {

            String s = m.get_item(i).getName()+"-------------------------------------------"+m.get_item(i).getPrice()+" LE\n\n"
                    +m.get_item(i).getDescription();
            adminlist.getItems().addAll(s);

        }
    }

    //transfer the menu to the client scene
    public void send_menu() throws IOException {
        //Load second scene
        menu m  = source.m  ;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("client.fxml"));
        Parent root = loader.load();

        //Get controller of scene2
        newclient scene2Controller = loader.getController();
        //Pass whatever data you want. You can have multiple method calls here
        scene2Controller.transferMessage(m);
        //scene2Controller.update(m);
    }

    public void add()
    {
        menu m  = source.m  ;
        String name = itemname.getText().toString();
        String quantity = itemquantity.getText().toString();
        Float price  = Float.valueOf(itemprice.getText().toString());
        String description = itemdesc.getText().toString();
        Item item = new Item(name,price,description);
        source.m.addItem(item);
        update_menu();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        menu m  = source.m  ;
        for (int i = 0; i < source.m.get_size(); i++) {

            String s = source.m.get_item(i).getName()+"-------------------------------------------"+ source.m.get_item(i).getPrice()+" LE\n\n"
                    + source.m.get_item(i).getDescription();
            Text t = new Text(s);
            t.setFont(Font.font("Verdana", FontWeight.BOLD,  12));
            //t.setFont(BOLD);

            adminlist.getItems().addAll(s);
            adminlist.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        }

    }

    //if you press back button it will get you back to login page
    public void back_login(ActionEvent event) throws IOException {
        //send_menu();
        Parent adminview = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene adminscene = new Scene(adminview);
        Stage window = (Stage)( (Node)event.getSource() ).getScene().getWindow();

        window.setScene(adminscene);
        window.show();
    }


}
