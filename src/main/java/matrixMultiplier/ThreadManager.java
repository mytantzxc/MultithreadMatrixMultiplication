package matrixMultiplier;

import java.util.ArrayList;
import java.util.List;

public class ThreadManager {

    private OperandsContainer operandsContainer;

    public ThreadManager(OperandsContainer operandsContainer) {
        this.operandsContainer = operandsContainer;
    }

    public void createThreads(){
        int[][] frstMatrix = operandsContainer.getFrstMatrix();
        int[][] scndMatrix = operandsContainer.getScndMatrix();
        List<ThreadMultiply> threads = new ArrayList<>();
        ThreadMultiply thread;
        for (int i = 0; i < frstMatrix.length; i++) {
            thread = new ThreadMultiply(frstMatrix[i], scndMatrix, i, operandsContainer);
            threads.add(thread);
            thread.start();
        }
        executeThreads(threads);
    }

    private void executeThreads(List<ThreadMultiply> threads) {
//        long start = System.currentTimeMillis();
        for (ThreadMultiply thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        long end = System.currentTimeMillis() - start;
//        System.out.println(end);
    }

    public void printResult(){
        operandsContainer.printResult();
    }
}
