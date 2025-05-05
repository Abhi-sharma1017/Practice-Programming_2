import java.util.Scanner;

// Rotate Matrix by 90 degree

public class RotateMatrixByDegree {

    // Reverse each row
    static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // Transpose the matrix
    static void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size of 2D array: ");
        int row = sc.nextInt();
        System.out.print("Enter col size of 2D array: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        System.out.println("Enter 2D array elements ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        RotateMatrixByDegree.transpose(arr);

        for (int i = 0; i < arr.length; i++) {
            reverse(arr[i]);
        }
        System.out.println("Matrix after 90 degree rotation:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
