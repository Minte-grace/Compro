public class Vanilla {
    public static void main(String[] args){
        System.out.println(isVanilla(new int[]{1}));
        System.out.println(isVanilla(new int[]{11,22,13,34,125}));
        System.out.println(isVanilla(new int[]{9,999,99999,9999}));
        System.out.println(isVanilla(new int[]{}));
        System.out.println(isVanilla(new int[]{0,00,00,0000}));
    }
    static int isVanilla(int a[]){
        if(a.length > 1){
            int checkingDigit = a[0]%10;
            for(int i=0; i<a.length; i++){
                int currentElement = a[i];
                while(currentElement>0){
                    int testedDigit = currentElement%10;
                    if(testedDigit != checkingDigit) return 0;
                    currentElement = currentElement/10;
                }
            }
        }
        return 1;
    }
}
