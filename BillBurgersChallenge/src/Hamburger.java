public class Hamburger {
    String name, addition1Name, addition2Name,
            addition3Name, addition4Name;
    String meat;
    Double price, addition1Price, addition2Price,
            addition3Price, addition4Price;
    String breadRollType;

    public Hamburger(String name,
                     String meat,
                     Double price,
                     String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double itemizehamburger() {
        double totalprice = this.price;
        System.out.println(name + " hamburger on a " + breadRollType + " with " + meat + ", price is " + this.price);
        if (addition1Name != null) {
            System.out.println("Added " + this.addition1Name +
                    " for an extra " + this.addition1Price);
            totalprice += addition1Price;
        }
        if (addition2Name != null) {
            System.out.println("Added " + this.addition2Name +
                    " for an extra " + this.addition2Price);
            totalprice += addition2Price;
        }
        if (addition3Name != null) {
            System.out.println("Added " + this.addition3Name +
                    " for an extra " + this.addition3Price);
            totalprice += addition3Price;
        }
        return totalprice;
    }


}

