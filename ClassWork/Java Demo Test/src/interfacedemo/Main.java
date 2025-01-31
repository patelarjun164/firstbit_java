package interfacedemo;

public class Main {

    public static void main(String[] args) {

       Jatra j1=new Jatra();

       Vehicle v1=new Vehicle("Shine");
       Animal a1=new Animal("Horse");

       j1.startRace(v1);

    }
}
