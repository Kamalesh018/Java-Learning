public class Example {
    public static void main(String[] args) {
        boolean isAlien = false;
        if(isAlien == true) {
            System.out.println("its is not an Alien");
        }
        else System.out.println("its is an alien");

        int topscore = 91 ;
        if(topscore < 100){
            System.out.println("you got a top score");
        }
        int secondtopscore = 95 ;
        if((topscore > secondtopscore) && (topscore < 100)){
            System.out.println("greater than second top score and less than 100");
        }
        if(topscore > 90 || secondtopscore <= 90){
            System.out.println("ethier or both of the conditions are true");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("this is suppose to run");
        }
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("this is true");
        }
    }
}
