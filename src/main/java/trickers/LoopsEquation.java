package trickers;


/**
 * Solution to: https://www.hackerrank.com/challenges/java-loops/problem
 */
public class LoopsEquation {
    public static void main(String []argh){
        int[][] inputs = getSampleInput();
        int t = inputs.length;
        for(int i=0;i<t;i++) {
            calculateResult(inputs[i][0], inputs[i][1], inputs[i][2]);
        }
    }

    private static int[][] getSampleInput() {
        int [][] inputs = new int[2][3];
        inputs[0][0] = 0;
        inputs[0][1] = 2;
        inputs[0][2] = 10;
        inputs[1][0] = 5;
        inputs[1][1] = 3;
        inputs[1][2] = 5;
        return inputs;
    }

    private static void calculateResult(int a, int b, int n) {
        double[] result = new double[n];
        double firstResult = (a + (Math.pow(2,0)*b));
        result[0] = firstResult;
        for (int i=1;i<n;i++) {
            double cr = 0;
            for (int j=1;j<=i;j++) {
                cr += (Math.pow(2,j)*b);
            }
            result[i] = firstResult + cr;
        }

        // Print the result
        for(int i=0;i<n;i++) {
            System.out.printf("%d ",(int)result[i]);
        }
        System.out.printf("\n");
    }
}
