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
        int reverse = 0;

        while (n != 0){
            reverse = n%10 + reverse*10;
            n = n/10;
        }
        return reverse;
    }
}
