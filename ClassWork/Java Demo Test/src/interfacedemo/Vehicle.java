package interfacedemo;

public class Vehicle implements Racer{

    private String name;
    Vehicle(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }
    @Override
    public void race() {
        System.out.println("Vehicle is racing");
    }
}
