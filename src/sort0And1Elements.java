public class sort0And1Elements {
    static void main(String[] args) {
        int [] arr= {1,0,0,1,0,1,1,1,0,0,1,0};
        int [] ans = sort(arr);
        for(int i :ans){
            System.out.print(i);
        }
    }
    static int[] sort(int [] arr){
        int count0 =0;
        int count1 = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            if(arr[i]==1){
                count1++;
            }
        }
        for(int i =0;i< arr.length;i++){
            if(i<count0){
                arr[i]=0;
            }
            else{
                arr[i] =1;
            }
        }
        return arr;
    }
}
