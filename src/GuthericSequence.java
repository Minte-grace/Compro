public class GuthericSequence {
    public static void main(String[] args){
        int[] testArray = {8,4,2};
        System.out.println(isGuthericSequence(testArray));
    }
    static int isGuthericSequence(int[] a){
        int flag = 1;
        if(a[a.length-1] != 1) return 0;
        for(int i =0; i< a.length -1; i++){
            if(a[i]%2==0){
                if(a[i+1] != a[i]/2){
                    flag = 0;
                    break;
                }
            } else {
                if(a[i+1] != 3*a[i]+1){
                    flag = 0;
                    break;
                }
            }
        }
        return flag;
    }
}
