package kamalesh.abs;

public class Horse extends Mammal{

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void makeNoise() {

    }
    @Override
    public void shedHair() {
        System.out.println(getExplictType() + " sheds in the spring");
    }
}
