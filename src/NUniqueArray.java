public class NUniqueArray {
    public static void main(String[] args){
        System.out.println(isNUniqueArray(new int[]{7,3,3,2,4},6));
        System.out.println(isNUniqueArray(new int[]{7,3,3,2,4},10));
        System.out.println(isNUniqueArray(new int[]{7,3,3,2,4},11));
        System.out.println(isNUniqueArray(new int[]{7,3,3,2,4},8));
    }
    static int isNUniqueArray(int[] a, int n){
        int count = 0;
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]+a[j]==n){
                    count++;
                }
            }
        }
        return count == 1 ? 1:0;
    }
}
