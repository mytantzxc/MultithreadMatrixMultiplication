package matrixMultiplier;

//простое умножение матриц
public class Multiplier{

    private OperandsContainer operandsContainer;

    public Multiplier(OperandsContainer operandsContainer) {
        this.operandsContainer = operandsContainer;
    }


    public static int[] matrixOnVector(int[] vector, int[][] matrix){
        int[] result = new int[vector.length];
        for (int i = 0; i < matrix.length; i++) {
            int summ = 0;
            for (int j = 0; j < matrix.length; j++) {
                summ += vector[j] * matrix[j][i];
            }
            result[i] = summ;
        }
        return result;
    }

    public void multiply(){
        int[][] array = operandsContainer.getFrstMatrix();
        int[][] ddArray = operandsContainer.getScndMatrix();
        int[][] result = new int[array.length][array.length];
        for (int i = 0; i < ddArray.length; i++) {
            for (int j = 0; j < ddArray.length; j++) {
                int summ = 0;
                for (int k = 0; k < ddArray.length; k++) {
                    summ += array[i][k] * ddArray[k][j];
                }
                result[i][j] = summ;
            }
        }
        operandsContainer.setResult(result);
    }
}
