public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if (number > 0) {
            for (int i = 1; i < number; i++) {
                int temp = number % i;
                if (temp == 0) {
                    sum += i;
                }
            }
            return sum == number;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
}
