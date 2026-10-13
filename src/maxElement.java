public class maxElement {
    static void main(String[] args) {
        int arr[] ={2,89,58,444,111,5};
        int ans = max(arr);
    }
    public static int max(int[] arr){
        int max =arr[0];
        for(int i:arr){
            if(max>i){
                max =i;
            }
        }
        return max;
    }
}
