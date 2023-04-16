public class EqualSumChecker {
    public static boolean hasEqualSum(int a, int b, int c){
        int z = a + b;
        if(c==z){
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
    }
}
