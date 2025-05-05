import java.util.Scanner;

public class ColWiseMaxElement {
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

        System.out.println("Col-wise maximum values:");

        for (int i = 0; i < arr[0].length; i++) {
            int max = arr[0][i];
            for (int j = 1; j < arr.length; j++) {
                if (max < arr[j][i]) {
                    max = arr[j][i];
                }
            }
            System.out.println("Col " + (1 + i) + ": " + max);
        }

        sc.close();
    }
}
