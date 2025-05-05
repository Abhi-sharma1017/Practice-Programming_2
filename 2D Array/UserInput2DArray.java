import java.util.Scanner;

public class UserInput2DArray {
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

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
