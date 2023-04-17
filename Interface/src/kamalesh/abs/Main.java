package kamalesh.abs;

import javax.sound.midi.Track;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnbedded flier = bird;
        Trackable tracked = bird;

        animal.move();
//        flier.move();
//        tracked.move(); // error will occur bcoz we initial the bird for
        // for the both types, those types dont have a move method
//
//        flier.takeOff();
//        flier.fly();
//        tracked.track();
//        flier.land();

        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnbedded.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n", kmsTraveled,milesTraveled);
    }

    private static void inFlight (FlightEnbedded flier) {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked) {
            tracked.track();
        }
        flier.land();
    }
}
