public class DigitSum {
    public static int sumDigits(int number){
        int sum = 0;
        int remainValue = 0;
        if (number < 0){
            return -1;
        }else if(number > 9){
            while (number > 9){
                remainValue = number % 10;
                number  = number / 10;
                sum += remainValue;
            }return sum;
        }return number;

    }


    public static void main(String[] args) {
        System.out.println(sumDigits(1234));

    }

    //username: juodejones2303@psnacet.edu.in
    //password: Jones2309@jetbrains
}
