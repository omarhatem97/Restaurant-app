package sample;

import java.util.ArrayList;

public class menu
{
    //DATA
    private ArrayList<Item> items = new ArrayList<Item>();


    //Functions
    public menu() {
        // constructs menu with default items

        //first item
        String name = "Mix 2 Meal (Hot OFFER !)";
        String d = "Pick two! Choose among the tasty Cheeseburger, the delicious Chicken MACDO or the juicy Beefburger + Fries + Drink.\n";
        Item item = new Item(name , (float) 70.0, d);
        items.add(item);
        //second item
        name = "McRoyale";
        d = "The McRoyale has it all! A juicy beef patty accompanied by cheese,covered with our special McRoyale sauce, crispy lettuce, fresh tomatoes,\n zesty onions and pickles all wrapped in a sesame seed bun.";
        Item item1 = new Item(name , (float)60 , d);
        items.add(item1);

        //third item
        name ="Big Mac";
        d = "Mouthwatering perfection is all about two 100% beef patties, that unbeatably tasty Big Mac sauce, melting signature cheese, \ncrisp shredded lettuce, onions, pickles and a bun in the middle all between a toasted sesame seed bun. You know you want to.";
        Item item2 = new Item(name , (float)80 , d);
        items.add(item2);

        //fourth item
        name ="Double Big Tasty (Discount 30%)";
        d = "When one Big Tasty just isn’t enough, go for the Double Big Tasty. It's not only one but two juicy beef patties smothered between slices \nof emmental cheese, topped with sliced tomato, shredded lettuce, onions and that special Big Tasty sauce.";
        Item item3 = new Item(name , (float)90 , d);
        items.add(item3);
        //fifth item
        name ="Cheeseburger";
        d = "Sometimes all you need is a classic. A legendary combination of our 100% juicy beef, melty cheese, chopped onions, pickles, ketchup \nand mustard, all in a soft burger bun.";
        Item item4 = new Item(name , (float) 50, d);
        items.add(item4);
        //six item
        name = "Double Quarter Pounder";
        d = "Satisfy your ultimate hunger. Start with two-quarter pounds of 100% beef, then complete the tasty picture with melty cheese, \nsilvered onions, tangy mustard, ketchup and pickles. Bet your mouth is watering right now";
        Item item5 = new Item(name , (float)70 , d);
        items.add(item5);
        //seventh item
        name = "Little Tasty";
        d = "Two juicy beef patties wrapped in layers of Emmental cheese, covered with a slice of tomato, shredded lettuce, silvered onions and special \nBig Tasty sauce. A little goes a long way";
        Item item6 = new Item(name , (float)75 , d);
        items.add(item6);
        // 8th item
        name = "Chicken Fillet";
        d = "It’s simple. A juicy white chicken breast encased in our special crispy coating with cool mustard mayo sauce, fresh tomatoes and onions, \ncrispy lettuce, all wrapped in a fresh sesame seed bun";
        Item item7 = new Item(name , (float)65 , d);
        items.add(item7);
        //9th item
        name ="Grand Chicken Spicy";
        d ="A delicious gently spiced grand chicken patty topped with our special deluxe sauce, two fresh tomato slices, crispy lettuce and two slices of\n Emmental cheese served in a 5 inch bun.";
        Item item8 = new Item(name , (float)70 , d);
        items.add(item8);
        //10th item
        name = "Beefburger";
        d ="A simply delicious grilled 100% beef patty with onions, pickles, mustard and a dollop of tomato ketchup, all in a soft bun. A classic,\n every time";
        Item item9 = new Item(name , (float)75 , d);
        items.add(item9);

    }
    //add new item to the menu
    public void additem(Item item)
    {
        items.add(item);
    }

    //print menu
    public void print()
    {
        for (int i = 0; i < items.size(); i++) {
            System.out.println("name is : " +items.get(i).getName().toString());
        }
    }


    public void addItem(Item item)
    {
        items.add(item);
    }


    public int get_size()
    {
        return items.size();
    }

    public Item get_item(int idx)
    {
        return items.get(idx);
    }

}
