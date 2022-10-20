public class StackedOrNot {
    public static void main(String[] args){
        System.out.println(isStacked(1));
        System.out.println(isStacked(3));
        System.out.println(isStacked(6));
        System.out.println(isStacked(10));
        System.out.println(isStacked(15));
        System.out.println(isStacked(7));
        System.out.println(isStacked(8));
        System.out.println(isStacked(9));
        System.out.println(isStacked(10));
        System.out.println(isStacked(7));
    }
    static int isStacked(int n){
        int result = 0;
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
            if(sum == n) {
                result = 1;
                break;
            }
        }
        return result;
    }
}
