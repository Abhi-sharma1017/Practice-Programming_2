import java.util.Scanner;

public class AllZeroElementInLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        System.out.print("Enter array elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[size];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(temp[i] + " ");
        }

        sc.close();
    }
}
