public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {

        if (!((a >= 10) && (a <= 99) && (b >= 10) && (b <= 99))) {
            return false;
        } else {
//            while (a > 0 && b > 0) {
                int newValue1 = a % 10; // nv1 = 5
                a /= 10;    // a = 7
                int newValue2 = b % 10;     // nv2 = 7
                b /= 10;    // b = 5
                if ((newValue1 == newValue2) || (newValue1 == b) || (a == newValue2)) {
                    return true;
                }
//            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 21));
    }
}
