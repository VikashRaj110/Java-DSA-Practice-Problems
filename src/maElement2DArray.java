import java.util.Scanner;

public class maElement2DArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int m = sc.nextInt();
        System.out.println("enter column");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        //input
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        // sum
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
        // maximum element
        int maxElement = arr[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]>maxElement){
                  maxElement = arr[i][j];
                }
            }
        }
        System.out.println(maxElement);
    }
}