abstract class Vehicle
{
    int vehicleId;
    String vehicleName;
    abstract void setDetails(int id,String name);
    abstract void Display();
}

class Car extends Vehicle
{

    void setDetails(int id, String name)
    {
        vehicleId=id;
        vehicleName=name;
    }

    void Display()
    {
        System.out.println("Car Name :" + vehicleName);
        System.out.println("Car Id   :" + vehicleId);
    }

}
public class Abstract {
    public static void main(String[] args) {
        Car c1= new Car();
        c1.setDetails(18977, "Tiago");
        c1.Display();
    }
}
