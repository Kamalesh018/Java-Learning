public class PrimeChallenge {
    public static boolean isPrime(int prime){
        if(prime<=2){
            return (prime == 2);
        }
        for (int divisor = 2; divisor <= prime/2; divisor++){
            if (prime % divisor == 0) {
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
        int primeCounter = 0;
        for(int i=10;i<=50;i++){
            if(isPrime(i)){
                System.out.println("number " + i + " is a prime");
                primeCounter++;
            }
        }
        System.out.println("total number of prime number between 2 and 1000 is " + primeCounter);
    }
}
