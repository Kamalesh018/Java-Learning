public class LeapYear {
    public static boolean isLeapyear(int year){
        if(year <= 1 || year >= 9999){
        return false;
    } else if (year % 4 ==0) {
            if(year % 100 == 0){
            return (year % 400 == 0);
            }else return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(isLeapyear(2016));
        System.out.println(isLeapyear(1600));
        System.out.println(isLeapyear(2017));
        System.out.println(isLeapyear(2000));
        System.out.println(isLeapyear(99999));
    }
}
