public class Challenge {
    public static void main(String[] args) {
        double d1 = 20.00d;
        double d2 = 80.00d;
        double d3 = d1 + d2 * 100.00d;
        System.out.println(d3);
        double d4 = d3 % 40.00d;
        System.out.println(d4);
        boolean noRemainder = (d4 == 0) ? true : false;
        System.out.println(noRemainder);
        if(d4 != 0){
            System.out.println("Got some remainder");
        }
    }
}
