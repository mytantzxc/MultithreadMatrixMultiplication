package matrixMultiplier;

public class MatrixGenerator {

    public static int[][] generateMatrix(int length){
        int[][] matrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                matrix[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
        return matrix;
    }
}
