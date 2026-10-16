public class BinarySearch {
    public  int binarySearch(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start +(end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

        public static void main(String[]args){
            int [] arr = {2,5,8,9,10};
            int target = 5;
            // since Since binarySearch() is a non-static method, we need an object to call it.
            BinarySearch bs = new BinarySearch();
            int result = bs.binarySearch(arr, target);

            System.out.println("The target value at index :" + result);
        }
}
