package kamalesh.abs;

public class Dog extends Mammal {


    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")) {
            System.out.println(getExplictType() + " waliking");
        }else{
            System.out.println(getExplictType()+ " running");
        }
    }

    @Override
    public void shedHair() {
        System.out.println(getExplictType() + " shed hair all the time");
    }

    @Override
    public void makeNoise() {
        if (type == "Wolf"){
            System.out.print("Howling! ");
        }else{
            System.out.print("Woof! ");
        }
    }
}
