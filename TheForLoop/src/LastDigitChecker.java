public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c){
        if (!((a >= 10) && (a <= 1000) && (b >= 10) && (b <= 1000))) {
            return false;
        }else {
            while (a > 0 && b > 0 && c > 0){
               int newValue1 = a % 10;
               a /= 10;
               int newValue2 = b % 10;
               b /= 10;
               int newValue3 = c % 10;
               c /= 10;
               if((newValue1==newValue2) || (newValue1 == newValue3) || (newValue2 == newValue3)){
                   return true;
               }
            }
        }return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(9,99,999));
    }
}
