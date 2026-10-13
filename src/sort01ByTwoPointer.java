import java.util.ArrayList;
import java.util.Collections;

public class sort01ByTwoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0};
        int[] ans = sort(arr);
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
    public static int[] sort(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] == 1 || arr[j] == 0) {
                //swap
//                int temp = arr[i];
//                arr[i] =arr[j];
//                arr[j] =temp;
                arr[i] =0;
                arr[j] =1;
            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }
        return arr;
    }
}
//ArrayList<Integer> list = new ArrayList<>();
//         for(int n:arr){
//        list.add(n);
//         }
//                 Collections.sort(list);
//        System.out.println(list);