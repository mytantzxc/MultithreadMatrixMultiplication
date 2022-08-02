package matrixMultiplier;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static int[][] runMultiply(int length){
        int[][] matrix1 = MatrixGenerator.generateMatrix(length);
        int[][] matrix2 = MatrixGenerator.generateMatrix(length);

        OperandsContainer operandsContainer =  new OperandsContainer(matrix1, matrix2);

        ThreadManager threadManager = new ThreadManager(operandsContainer);
        threadManager.createThreads();

        return operandsContainer.getResult();
    }

    public static int[][] runMultiply(int[][] matrix1, int[][] matrix2 ){
        OperandsContainer operandsContainer =  new OperandsContainer(matrix1, matrix2);

        ThreadManager threadManager = new ThreadManager(operandsContainer);
        threadManager.createThreads();

        return operandsContainer.getResult();
    }
}
