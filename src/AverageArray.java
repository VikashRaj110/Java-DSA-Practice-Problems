public class AverageArray {
    static void main(String[] args) {
        int [] arr ={25,98,258,98,41326,25};
        double answer = average(arr);
        System.out.println(answer);
    }
    public static double average(int[] arr){
        double average;
        int sum =0;
        int n = arr.length;
//        for(int i =0;i<n;i++){
//            sum+= arr[i];
//        }
        for(int i: arr){
            sum+=i;
        }
        average = (double) sum/n;
        return average;
    }
}
