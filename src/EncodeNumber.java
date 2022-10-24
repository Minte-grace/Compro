public class EncodeNumber {

    public static void main(String[] args){
        System.out.println(encodeNumber(6936));
    }
    static int[] encodeNumber(int n){
        int count = 0;
        int num = 1;
        for(int i=2; i<n; i++){
            if(isPrime(i)==1){
                num = num*i;
                count++;
                if(num==n){
                    int[] e = new int[count];
                    for(int j=0; j<count; j++){
                        e[j] = i;
                    }
                    return e;
                }
            }
        }
        return null;

    }

    static int isPrime(int n){
        int result =1;
        for(int i=2; i<n;i++){
            if(n%i == 0){
                result = 0;
                break;
            }
        }
        return result;
    }
}
