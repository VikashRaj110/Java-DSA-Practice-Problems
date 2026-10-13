public class multiplyElement {
    static void main(String[] args) {
        int [] arr = {2,8,5,9,4,6,25,4};
        int num =10;
       int [] ans =  multiply(arr,num);
         for(int i : ans){
             System.out.println(i +" ");
         }
    }
    public static int [] multiply(int [] arr,int num){
        int n = arr.length;
        int [] newArray = new int[n];
//        for(int i =0;i<arr.length;i++){
//            arr[i]*= num;
//        }
//        return arr;
        for(int i=0;i<n;i++){
            newArray[i] = arr[i]*num;

        }
        return newArray;
    }
}
