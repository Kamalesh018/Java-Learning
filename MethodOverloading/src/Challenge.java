public class Challenge {
    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(6 ,0);
        if(centimeters < 0.0){
            System.out.println("invalid parameters");
        }
        calcFeetAndInchesToCentimeters(100);

    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || ((inches < 0) || (inches > 12))){
            System.out.println("invalid feet and inches");
            return -1;
        }
        double centimetres = (feet * 12) * 2.54;
        centimetres += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + centimetres + " cm");
        return centimetres;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return  -1;
        }
        double feet  = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + "feet and " + remainingInches + " Inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }



}
