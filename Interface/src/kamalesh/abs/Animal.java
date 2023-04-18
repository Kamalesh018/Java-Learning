package kamalesh.abs;

enum FlightStages implements Trackable {GROUNDED, LAUNCH, CRUISE,DATA_COLLECTION;

    @Override
    public void track() {
        if(this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }
}
record DragonFLy(String name, String type) implements FlightEnbedded {

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

class Statellite implements OrbitEarth {
     public void achieveOrbit() {
        System.out.println("Orbit achieved");
    }

    @Override
    public void takeOff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}

interface OrbitEarth extends FlightEnbedded {
    void achieveOrbit();
}
interface FlightEnbedded {
    double MILES_TO_KM = 1.60934;
    double KM_TO_MILES = 0.621371;
    void takeOff();
    void land();
     void fly();
}
interface Trackable {
    void track();
}
public abstract class Animal {
    public abstract void move();
}
