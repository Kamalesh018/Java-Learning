package kamalesh.abs;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product){}
public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        storeProducts.add(new ArtObject("oil painting",1350,"impressionstic work by ABF painted in 2010"));

        storeProducts.add(new ArtObject("Sculpture", 2000,"bronze work by JKF, product in 1950"));

        storeProducts.add(new Furniture("lamp",200,"tiffany lamp with Hummingbirds"));
        System.out.println(new Furniture("Desk",500,"Mahogany Desk"));
        listProducts();

        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1,1,2);
        addItemToOrder(order1,0,1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2,3,5);
        addItemToOrder(order2,0,1);
        addItemToOrder(order2,2,1);
        printOrder(order2);
    }

    public static void listProducts() {
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex,
                                      int qty){
        order.add(new OrderItem(qty,storeProducts.get(orderIndex)));
    }

    public static void printOrder(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        // Getting items
        for (var item : order) {
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n ", salesTotal);
    }

}