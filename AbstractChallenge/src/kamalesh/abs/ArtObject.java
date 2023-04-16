package kamalesh.abs;

public class ArtObject extends ProductForSale {
    public ArtObject(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("this " + type + "is a beautiful reproduction");
        System.out.printf("this price of the piece is $%6.2f %n",price);
        System.out.println(description);
    }
}
