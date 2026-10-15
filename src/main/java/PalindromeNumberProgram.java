import java.util.Scanner;

public class PalindromeNumberProgram {
    
    public static boolean isPalindrome(int number) {
        if (number < 0) return false;
        int sign = number < 0 ? -1 : 1;
        long remaining = Math.abs((long) number);
        long reversed = 0;
        while (remaining > 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }
        int num = (int) (sign * reversed);
        return number==num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.println(number + (isPalindrome(number) ? " is a palindrome." : " is not a palindrome."));
    }
}
