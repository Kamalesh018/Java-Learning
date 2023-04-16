public class SumOdd {
    public static boolean isOdd(int num){
        if((num > 0) && (num % 2 != 0)){
            return true;
        }return false;
    }
    public static int sumOdd(int start, int end) {
        int oddCount = 0;
        if ((end >= start) && (start > 0 && end > 0)) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    oddCount = oddCount + i;
                }
            }return oddCount;
        }else return -1;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
    }
}
