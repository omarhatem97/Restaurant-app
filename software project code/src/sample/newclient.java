package sample;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class newclient implements Initializable
{
    @FXML
    private Button back;
    @FXML
    private TextArea  shoppinglist;
    @FXML
    private ListView client_menu;
    @FXML
    private RadioButton indoors;
    @FXML
    private  RadioButton delivery;
   // private ListView m;
    private float totalPrice = 0;
    private String s = "";
    private menu main_menu= new menu();
   // private menu my_menu = new menu();

    public void set_shoppinglist() throws IOException
    {
        ObservableList listitems = client_menu.getSelectionModel().getSelectedIndices();
        menu m = new menu();
        s = ""; totalPrice =0;
        String temp = "" ,res ="";
        for (int i = 0; i < listitems.size(); i++) {
            Integer idx = (Integer) listitems.get(i);
            totalPrice += source.m.get_item(i).getPrice();
            s+= source.m.get_item(idx).getName() + "--------"+ source.m.get_item(idx).getPrice() +"LE"+ "\n";
        }
        shoppinglist.setText(s);
    }

    public void calc_price()
    {

        if(indoors.isSelected())
        {
            totalPrice += totalPrice*0.14;
        }
        else if (delivery.isSelected())
        {
            totalPrice += totalPrice + 20;
        }
        System.out.println(totalPrice);
        s+= "\n\n------------------------------\nTotal price = " + String.valueOf(totalPrice)+ " LE";
        shoppinglist.setText(s);
    }

    //Elements that get initialzed in menu list as soon as scene is created
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        //main_menu = source.m;
        System.out.println("i am the newclient initilizer");
        for (int i = 0; i < source.m.get_size(); i++) {

            String s = source.m.get_item(i).getName()+"-------------------------------------------"+ source.m.get_item(i).getPrice()+" LE\n\n"
                    + source.m.get_item(i).getDescription();
            Text t = new Text(s);

            client_menu.getItems().addAll(s);
            client_menu.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        }

    }

    public void back_login(javafx.event.ActionEvent event) throws IOException {
        Parent adminview = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene adminscene = new Scene(adminview);
        Stage window = (Stage)( (Node)event.getSource() ).getScene().getWindow();

        window.setScene(adminscene);
        window.show();
    }

    public void transferMessage(menu m1) {

        main_menu = m1;
        System.out.println("name is : " +main_menu.get_item(10).getName());

    }



    public void update(menu m) {
        for (int i = 0; i < source.m.get_size(); i++) {

            String s = source.m.get_item(i).getName() + "-------------------------------------------" + m.get_item(i).getPrice() + " LE\n\n"
                    + source.m.get_item(i).getDescription();
            Text t = new Text(s);

            client_menu.getItems().addAll(s);
        }
    }
}
