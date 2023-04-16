public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        number = Math.abs(number);
        int reverse = 0;
        int lastDigit;
        int temp = number;
        while(temp > 0){
            lastDigit = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + lastDigit;
        }
        if(number == reverse){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-1210));
    }

}
