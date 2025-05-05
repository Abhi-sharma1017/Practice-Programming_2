public class MultipleOfMatrix {
    static int matrixSize = 3;

    static void multiply(int[][] arr1, int[][] arr2, int[][] res) {

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                res[i][j] = 0;
                for (int k = 0; k < matrixSize; k++) {
                    res[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int[][] res = new int[matrixSize][matrixSize];
        multiply(arr1, arr2, res);
        System.out.println("Multiplication of 2D Matrix: ");

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
