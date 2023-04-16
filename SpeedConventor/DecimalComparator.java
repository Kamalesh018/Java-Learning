public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a,double b){
        a = a * 1000;
        b = b * 1000;
        int newVariable1 = (int) a ; // by casting method
        int newVariable2 =(int) b;
        if(newVariable1==newVariable2){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
    }
}
