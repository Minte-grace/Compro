public class Madhav {
    public static void main(String[] args){
        System.out.println(isMadhavArray(new int[]{2,1,1}));
        System.out.println(isMadhavArray(new int[]{2,1,1,4,-1,-1}));
        System.out.println(isMadhavArray(new int[]{6,2,4,2,2,2,1,5,0,0}));
        System.out.println(isMadhavArray(new int[]{18,9,10,6,6,6}));
        System.out.println(isMadhavArray(new int[]{-6,-3,-3,8,-5,-4}));
        System.out.println(isMadhavArray(new int[]{0,0,0,0,0,0,0,0,0,0,1,1,1,-2,-1}));
        System.out.println(isMadhavArray(new int[]{3,1,2,3,0}));
    }
    public static int isMadhavArray(int[] a) {
        int temp=1,condition=1,sum,indexlength=2,condition2=2,indexboundery=1;
        for(;temp<a.length;){
            sum=0;
            if(indexlength<a.length){
                for(int i=indexboundery;i<=indexlength;i++){
                    sum=sum+a[i]; temp++;
                }
                if(a[0]==sum){
                    condition2++; indexlength+=condition2; indexboundery=temp;
                }
                else{
                    condition=0; break;
                }
            }
            else{
                condition=0; break;
            }
        }
        return condition;
    }
}
