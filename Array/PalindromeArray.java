import java.util.Scanner;

public class PalindromeArray {

    public static boolean isPalindrome(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            if (arr[first] != arr[last]) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        if (isPalindrome(arr)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        sc.close();
    }
}
