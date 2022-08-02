import matrixMultiplier.Runner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;

public class TestClass {

    @Test
    public void test1(){
        int[][] matrix1 = {
            {1,2,3},
            {1,1,1},
            {0,2,3}
        };
        int[][] matrix2 = {
                {1,1,1},
                {1,2,3},
                {0,2,3}
        };

        int[][] expected = {
                {3,11,16},
                {2,5,7},
                {2,10,15}
        };
        int[][] result = Runner.runMultiply(matrix1, matrix2);
        Assertions.assertTrue(Arrays.deepEquals(expected,result));
    }

    @Test
    public void test2(){
        int[][] matrix1 = {
                {1,1,1},
                {1,2,3},
                {0,2,3}
        };

        int[][] matrix2 = {
                {1,2,3},
                {1,1,1},
                {0,2,3}
        };
        int[][] expected = {
                {2,5,7},
                {3,10,14},
                {2,8,11}
        };

        int[][] result = Runner.runMultiply(matrix1, matrix2);
        Assertions.assertTrue(Arrays.deepEquals(expected,result));
    }

    @Test
    public void test3(){
        int[][] matrix1 = {
                {1,1,1,2,2,2,1},
                {1,0,3,1,3,1,4},
                {1,2,2,0,1,1,4},
                {1,0,3,1,3,1,4},
                {1,1,1,2,2,2,1},
                {1,0,3,1,3,1,4},
                {1,1,2,0,1,1,4}
        };
        int[][] matrix2 = {
                {1,3,3,2,2,2,1},
                {1,4,3,1,3,1,4},
                {1,1,2,0,1,0,4},
                {1,3,2,1,3,2,4},
                {1,1,1,2,2,2,1},
                {1,0,3,3,3,5,5},
                {1,0,2,0,1,1,4}
        };
        int[][] expected = {
                {10,16,22,15,23,22,33},
                {13,12,25,12,21,19,41},
                {11,14,25,9,19,15,39},
                {13,12,25,12,21,19,41},
                {10,16,22,15,23,22,33},
                {13,12,25,12,21,19,41},
                {10,10,22,8,16,14,35}

        };
        int[][] result = Runner.runMultiply(matrix1, matrix2);
        Assertions.assertTrue(Arrays.deepEquals(expected,result));
    }
}
