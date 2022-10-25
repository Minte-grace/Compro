public class Smallest {
    public static void main(String[] args){
        System.out.println(smallest(624));
//        System.out.println(smallest(624));
//        System.out.println(smallest(624));
//        System.out.println(smallest(124));
    }
    static int smallest(int n){
        int multiplier = 1;
        int origionalNumber = n;
        int count = 1;
        while(multiplier<n){
            if(n%10 == 2){
                count++;
                multiplier++;
                System.out.println(n);
                n= origionalNumber*multiplier;
            } else {
                n=n/10;
            }
        }
        return count;
    }
}
