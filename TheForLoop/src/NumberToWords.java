import static java.lang.Math.abs;

public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            //int reversed = reverse(number);
            String ans =" ";
            int orginalNumberDigit = getDigitCount(number);
            for (int i = 0; i < orginalNumberDigit; i++) {
                switch (number % 10) {
                    case 0 -> ans = "zero "+ ans;
                    case 1 -> ans = "First " + ans;
                    case 2 -> ans = "Two " + ans;
                    case 3 -> ans = "Three " + ans;
                    case 4 -> ans = "Four " + ans;
                    case 5 -> ans = "Five " + ans;
                    case 6 -> ans = "Six " + ans;
                    case 7 -> ans = "Seven " + ans;
                    case 8 -> ans = "Eight " + ans;
                    case 9 -> ans = "Nine " + ans;
                    default -> System.out.print("No Number");

                }
                number /= 10;
            }System.out.println(ans);
        }
    }

    public static String reverse(int number) {
        String reverseNumber = "";
        int org = number;
        int lastDigit = 0;
        while (number != 0) {
            lastDigit = number % 10;
            reverseNumber = reverseNumber + abs(lastDigit);
            number /= 10;

        }
       if(org<0) return "-"+reverseNumber;
                else return reverseNumber;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        } else {
            int digitCount = 0;
            while (number > 0) {
                digitCount++;
                number /= 10;
            }
            if (digitCount == 0) {
                digitCount++;

            }
            return digitCount;

        }
    }

    public static void main(String[] args) {
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
}
