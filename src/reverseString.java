import java.util.Scanner;

public class reverseString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
          String str = sc.nextLine();
        System.out.println("Original String " + str);
        System.out.println("Reversed String " + reverse(str));
    }
    public static String reverse(String str){
        // brute force
//        StringBuilder rev= new StringBuilder();
//        for(int i = str.length()-1;i>=0;i--){
//            rev.append(str.charAt(i));
//        }
//        return rev.toString();
        // optimized aaproach
        char [] arr = str.toCharArray();
        int i =0;
        int j = arr.length-1;
        while(i<j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
