public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = 0;
        if (number < 0) {
            return -1;                  //  3243 324 32 3
        } else {
                lastDigit = number % 10; // 3 4 2 3
            while (number > 10) {
                number = number / 10; //324 32 3 0
            }
            return lastDigit + number; // 3+0
        }
        /*if (number < 0) return -1;
        else if (number <= 9) return number;
        int lastDigit = number % 10;
        while (number >  10) number/=10;
        return number+lastDigit;*/
    }
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(-2252));

    }
}
