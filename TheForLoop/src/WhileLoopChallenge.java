public class WhileLoopChallenge {
    public static boolean isEvenNumber(int a){
        if(a % 2 == 0){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        int a = 5;
        int evenCount = 0;
        int oddCount = 0;
        while(a <= 20){
            a++;
            if(!(isEvenNumber(a))) {
                oddCount++;
                continue;
            }
                System.out.println("even number " + a);
            evenCount++;
            }
        System.out.println("total no of even number : " + evenCount);
        System.out.println("total no of odd number : " + oddCount);
        }
    }
