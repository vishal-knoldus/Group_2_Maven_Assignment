import java.util.Scanner;
public class Application{
    public static void main(String []args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();
        StringFunctions revSize = new StringFunctions();
        System.out.println("Reverse of the string is "+ revSize.reverseString(str));
        System.out.println("Reverse of the string is "+ revSize.stringLength(str));
    }
}