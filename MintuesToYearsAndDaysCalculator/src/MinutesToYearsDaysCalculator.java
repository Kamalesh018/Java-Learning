public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(int minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            int Days = (minutes /1440);
            int year = (Days / 365);
            long remainingDays = Days % 365;
            System.out.println(minutes + " min" + " = " + year + "y and " + remainingDays + "d");
        }
    }
    public static void main(String[] args) {
        printYearsAndDays(525600);
    }
}
