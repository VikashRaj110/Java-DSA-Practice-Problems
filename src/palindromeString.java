import java.util.Scanner;

public class palindromeString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("palindrome ");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
    public static boolean isPalindrome(String str){
//            StringBuilder rev = new StringBuilder();
//            for(int i = str.length()-1;i>=0;i--){
//                rev.append(str.charAt(i));
//            }
//            return str.contentEquals(rev);
        int i =0;
        int j =str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
