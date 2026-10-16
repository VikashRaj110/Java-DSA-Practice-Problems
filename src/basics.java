import java.math.BigInteger;
import java.util.Scanner;
public class basics {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        int FirstNo = sc.nextInt();
        System.out.println("Enter your Second number");
        int SecondNo = sc.nextInt();
        int ans = FirstNo + SecondNo;
        System.out.println("Answer is " + ans);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger is"+ bg);

        boolean flag = sc.nextBoolean();
        System.out.println("Boolean is "+ flag);

        System.out.println("Enter shortValue");
        short shortValue = sc.nextShort();
        System.out.println("shortValue "+ shortValue);

        System.out.println("Enter floatValue");
        float floatValue= sc.nextFloat();
        System.out.println("floatValue "+ floatValue);

        sc.close();




    }
}
