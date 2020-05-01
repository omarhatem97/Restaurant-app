package sample;


public class Item
{
    //DATA
    private String name;
    private String description;
    private Float price;
    private Float quantity;

    //constructor
    public Item(String Name , Float Price, String Description)
    {
        name = Name;
        price =Price;
        description  =Description;
    }



    //Functions


    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Float getPrice() {
        return price;
    }

    public Float getQuantity() {
        return quantity;
    }
}
