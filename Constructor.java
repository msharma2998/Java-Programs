class Item
{
    public int itemID;
    public String itemName;

    Item()
    {
        itemID=0;
        itemName="None";
    }
    Item(int id,String name)
    {
        itemID=id;
        itemName=name;
    }

    void display()
    {
        System.out.println("Item Name : " + itemName);
        System.out.println("Item ID   : " + itemID);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Item i1 = new Item();
        Item i2 = new Item(123,"Extension Board");
        i1.display();
        i2.display();
    }    
}
