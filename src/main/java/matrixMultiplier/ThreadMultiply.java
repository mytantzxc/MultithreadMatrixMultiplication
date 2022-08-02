package matrixMultiplier;

public class ThreadMultiply extends Thread {

    private int[] vector;
    private int[][] matrix;
    private int rowNumber;
    private OperandsContainer operandsContainer;

    public ThreadMultiply(int[] vector, int[][] matrix, int rowNumber, OperandsContainer operandsContainer) {
        this.vector = vector;
        this.matrix = matrix;
        this.rowNumber = rowNumber;
        this.operandsContainer = operandsContainer;
    }

    @Override
    public void run() {
        int[] resultVector = Multiplier.matrixOnVector(vector, matrix);
        operandsContainer.setResultRow(rowNumber, resultVector);
    }


}
