public class OneToOneArray {
    public static void main(String[] args){
        System.out.println(is121Array(new int[]{1,2,1}));
        System.out.println(is121Array(new int[]{1,1,2,2,2,1,1}));
        System.out.println(is121Array(new int[]{1,1,2,2,1,1,1}));
        System.out.println(is121Array(new int[]{1,1,2,1,2,1,1}));
        System.out.println(is121Array(new int[]{1,1,1,2,2,2,1,1,1,3}));
        System.out.println(is121Array(new int[]{1,1,1,1,1,1}));
        System.out.println(is121Array(new int[]{2,2,2,1,1,1,2,2,2,1,1}));
        System.out.println(is121Array(new int[]{1,1,1,2,2,2,1,1,2}));
    }
    static int is121Array(int[] a){
        if(a[0] != 1 || a[a.length-1] !=1) return 0;
        if(a[a.length/2] != 2) return 0;
        int onceBeforeTwo = 0;
        int onceAfterTwo = 0;
        for(int i=1; i<a.length-1; i++){
            if((a[i] !=1) && (a[i] !=2)) return 0;
            if(a[i] - a[i-1] == 1){
                onceBeforeTwo = i;
            }
            if(a[i] - a[i+1] == 1) {
                onceAfterTwo = a.length - (i+1);
            }
        }
        if(onceBeforeTwo != onceAfterTwo) return 0;
        return 1;
    }
}
