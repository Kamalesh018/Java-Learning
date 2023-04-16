public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first >= 10 && second >= 10) {
            int min;
            if (first < second) {
                min = first;
                if (second % first == 0) {
                    return first;
                } else {
                    min = second;
                    if (first % second == 0) {
                        return second;
                    }
                }for(int i = min/2; i > 1;i--){
                    if((first % i == 0) && (second % i == 0)){
                        return i;
                    }
                }
            }return 1;
        }return -1;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
    }
}