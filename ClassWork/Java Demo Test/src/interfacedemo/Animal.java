package interfacedemo;

public class Animal implements Racer{

    String name;

    Animal(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }
    @Override
    public void race() {
        System.out.println("Animal is racing");
    }
}
