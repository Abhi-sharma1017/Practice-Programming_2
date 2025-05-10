import java.util.Scanner;

// eg- {1,2,4,5} => Missing element- 3

public class MissingElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array length: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("Enter array element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int originalSize = arr.length + 1;
        int expectedSum = originalSize * (originalSize + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }
        int missingElement = expectedSum - actualSum;
        System.out.println("Missing Element - " + missingElement);

        sc.close();
    }
}