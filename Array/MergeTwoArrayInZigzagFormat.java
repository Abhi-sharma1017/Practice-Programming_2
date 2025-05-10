import java.util.Scanner;

// eg- arr1 = {1,2,3,4,5} | arr2 = {6,7,8,9,10}
// Zigzag format -  {1,6,2,7,3,8,4,9,5,10}

public class MergeTwoArrayInZigzagFormat {

    public static int[] mergeZigzagArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] Zigzag = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                Zigzag[k++] = arr1[i++];
                Zigzag[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            Zigzag[k++] = arr1[i++];
        }
        while (j < n2) {
            Zigzag[k++] = arr2[j++];
        }

        return Zigzag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st array size: ");
        int size1 = sc.nextInt();
        System.out.print("Enter 2nd array size: ");
        int size2 = sc.nextInt();
        System.out.print("Enter 1st array element: ");
        int[] arr1 = new int[size1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter 2nd array element: ");
        int[] arr2 = new int[size2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArray = mergeZigzagArray(arr1, arr2);
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        sc.close();

    }
}
