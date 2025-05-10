import java.util.Scanner;

// eg- arr1 = {1,2,4,6} | arr2 = {2,5,7,9}
// o/p- res = {1,2,2,4,5,6,7,9}

public class MergeTwoSortedArrayIntoSingleArray {

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] res = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                res[k++] = arr1[i++];
            } else {
                res[k++] = arr2[j++];
            }
        }

        while (i < n1) {
            res[k++] = arr1[i++];
        }
        while (j < n2) {
            res[k++] = arr2[j++];
        }

        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st sorted array size: ");
        int size1 = sc.nextInt();
        System.out.print("Enter 2nd sorted array size: ");
        int size2 = sc.nextInt();
        System.out.print("Enter 1st sorted array element: ");
        int[] arr1 = new int[size1];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter 2nd sorted array element: ");
        int[] arr2 = new int[size2];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] mergedArray = mergeArray(arr1, arr2);
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        sc.close();

    }
}
