package interfacedemo;

public class Jatra {



        public void startRace(Racer racer)
        {
            if(racer instanceof Vehicle) {
                Vehicle v = (Vehicle) racer;
                System.out.println(v.getName());
            }
            if(racer instanceof Animal) {
                Animal v = (Animal) racer;
                System.out.println(v.getName());
            }
            racer.race();
        }




}
