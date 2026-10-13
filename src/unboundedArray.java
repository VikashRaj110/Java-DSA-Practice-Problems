
public class unboundedArray {
    public static int search(int[] arr, int target) {

        if (arr[0] == target) {
            return 0;
        }

        int i = 1;

        // Find the range where the target may exist
        while (arr[i] <= target) {
            i = i * 2;
        }
        if (arr[i] > target) {
            int s = i / 2;
            int e = i;

            // Binary Search
            while (s <= e) {
                int mid = s + (e - s) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
            return -1;
        }

        public static void main (String[]args){
            int[] arr = {2, 4, 9, 16, 19, 58, 82, 96, 110, 115, 258};
            int target = 110;

            int result = search(arr, target);

            System.out.println("Index: " + result);
        }
    }
