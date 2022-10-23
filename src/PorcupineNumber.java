public class PorcupineNumber {
    public static void main(String[] args){
        System.out.println(findPorcupineNumber(0));
        System.out.println(findPorcupineNumber(3));
        System.out.println(findPorcupineNumber(6));
        System.out.println(findPorcupineNumber(139));
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
        int result =0;
        int i=n+1;
        while (i>n){
            if(isPrime(i) == 1 && i%10 == 9){
                result=i;
                break;
            }
            i++;
        }
        return result;
    }
}
