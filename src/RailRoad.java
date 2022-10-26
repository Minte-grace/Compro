public class RailRoad {
    public static void main(String[] args){
        System.out.println(isRailRoadTie(new int[]{1,2}));
        System.out.println(isRailRoadTie(new int[]{1,2,0,1,2,0,1,2}));
        System.out.println(isRailRoadTie(new int[]{3,3,0,3,3,0,3,3,0,3,3}));
        System.out.println(isRailRoadTie(new int[]{0,0,0,0}));
        System.out.println(isRailRoadTie(new int[]{1,2,0,3,-18,0,2,2}));
        System.out.println(isRailRoadTie(new int[]{1,2,3,0,2,2}));
        System.out.println(isRailRoadTie(new int[]{0,1,2,0,3,4}));
    }
    static int isRailRoadTie(int[] a){
        int countNumberOfZeros = 0;

        if(a[0]==0 || a[1]==0) return 0;

        for(int i=1; i<a.length-1; i++){
            if(a[i]==0){
                countNumberOfZeros++;
                if(countNumberOfZeros == a.length) return 0;
                if(a[i-1] ==0 || a[i+1]==0){
                    return 0;
                }
            } else {
                if((a[i-1] ==0 && a[i+1]==0)||(a[i-1] !=0 && a[i+1]!=0)) return 0;
            }
        }
        return 1;
    }
}
