public class LegalBase {
    public static void main(String[] args){
        System.out.println(isLegalNumber(new int[]{3,2,1},4));
        System.out.println(isLegalNumber(new int[]{3,7,1},6));
        System.out.println(isLegalNumber(new int[]{3,7,1},8));
        System.out.println(isLegalNumber(new int[]{3,7,9},6));
    }
    static int isLegalNumber(int[] a, int base){
        int result = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]>=0 && a[i]< base){
                result = 1;
            }
            else {
                result = 0;
                break;
            }
        }
        return result;
    }
}
