public class IsSquare {
    public static void main(String[] args){
        System.out.println(isSquare(4));
        System.out.println(isSquare(25));
        System.out.println(isSquare(-4));
        System.out.println(isSquare(8));
        System.out.println(isSquare(0));
    }
    static int isSquare(int n){
        int result = 0;
        for(int i=0; i<=n; i++){
                if(i*i == n){
                    result = 1;
                    break;
                }
        }
        return result;
    }
}
