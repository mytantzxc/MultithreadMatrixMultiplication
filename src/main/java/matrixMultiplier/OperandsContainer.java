package matrixMultiplier;

public class OperandsContainer {

    private int[][] frstMatrix;
    private int[][] scndMatrix;
    private int[][] result;

    public OperandsContainer(int[][] frstMatrix, int[][] scndMatrix) {
        this.frstMatrix = frstMatrix;
        this.scndMatrix = scndMatrix;
        this.result = new int[frstMatrix.length][frstMatrix.length];
    }

    public int[][] getFrstMatrix() {
        return frstMatrix;
    }

    public int[][] getScndMatrix() {
        return scndMatrix;
    }

    public void setResultRow(int rowNumber, int[] vector){
        this.result[rowNumber] = vector;
    }

    public void setResult(int[][] result) {
        this.result = result;
    }

    public int[][] getResult() {
        return result;
    }

    public void printResult(){
        StringBuilder frst = new StringBuilder();
        StringBuilder scnd = new StringBuilder();
        StringBuilder rslt = new StringBuilder();
        for (int i = 0; i < frstMatrix.length; i++) {
            for (int j = 0; j < frstMatrix.length; j++) {
                frst.append(frstMatrix[i][j] + " ");
                scnd.append(scndMatrix[i][j] + " ");
                rslt.append(result[i][j] + " ");
            }
            frst.append("\n");
            scnd.append("\n");
            rslt.append("\n");
        }

        System.out.println(frst);
        System.out.println("--------------------------------------");
        System.out.println(scnd);
        System.out.println("--------------------------------------");
        System.out.println(rslt);
    }
}
