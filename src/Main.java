import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter your string, to check if it is Palindrome.");
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        System.out.println(isPalindrome(n));
    }

    public static String isPalindrome(String string){

        String stringButTrimmed = string.toLowerCase().replace(" ","");

        int length = stringButTrimmed.length();
        for (int i = 1; i < length; i++) {

            if(stringButTrimmed.charAt(i - 1) != stringButTrimmed.charAt(length-i )){
                return "Your string is not Palindrome.";
            }

        }
        return "Your string is Palindrome!";
    }
}
