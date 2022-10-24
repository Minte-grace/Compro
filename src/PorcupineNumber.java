public class PorcupineNumber {
    public static void main(String[] args){
        System.out.println(findPorcupineNumber(0));
        System.out.println(findPorcupineNumber(3));
        System.out.println(findPorcupineNumber(6));
        System.out.println(findPorcupineNumber(159));
    }
    static int isPrime(int n){
        for(int i=2; i<n;i++){
           if(n%i == 0){
               return 0;
           }
        }
        return 1;
    }
    static int findPorcupineNumber(int n){
        int porcupine = 0;
        int maxInteger = Integer.MAX_VALUE;
        boolean isPorcupine = false;
        n++;
        while(n<maxInteger){
            if(isPorcupine){
                if(isPrime(n)==1){
                    if(n%10==9){
                        break;
                    }
                    else {
                        isPorcupine = false;
                    }
                }
            } else {
                if(isPrime(n)==1){
                    if(n%10==9){
                        isPorcupine = true;
                        porcupine = n;
                    }
                }
            }
            n++;
        }
        return porcupine;
    }
}
