public class ReverseInteger {
    public static void main(String[] args){
        System.out.println(reverseInt(1234));
        System.out.println(reverseInt(12005));
        System.out.println(reverseInt(1));
        System.out.println(reverseInt(1000));
        System.out.println(reverseInt(0));
        System.out.println(reverseInt(-12345));
    }
    static int reverseInt(int n){
        int reversed = 0;

        while(n!=0){
            reversed = reversed*10 + n%10;
            n = n/10;
        }
        return reversed;

    }
}
