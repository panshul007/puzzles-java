package trickers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Problem URL: https://www.hackerrank.com/challenges/java-arraylist/problem
 */
public class ArrayListQueries {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int dataSize = sc.nextInt();
//        ArrayList<int[]> dataSet = new ArrayList<>();
//        for (int i = 0; i < dataSize; i++) {
//            int lineSize = sc.nextInt();
//            int[] lineInput = new int[lineSize];
//            for (int j = 0; j < lineSize; j++) {
//                lineInput[j] = sc.nextInt();
//            }
//            dataSet.add(lineInput);
//        }
//        int querySize = sc.nextInt();
//        ArrayList<int[]> querySet = new ArrayList<>();
//        for (int i = 0; i < querySize; i++) {
//            int[] queryInput = new int[2];
//            for (int j = 0; j < 2; j++) {
//                queryInput[j] = sc.nextInt();
//            }
//            querySet.add(queryInput);
//        }

        ArrayList<int[]> dataSet = new ArrayList<int[]>() {{
            add(new int[]{41,77,74,22,44});
            add(new int[]{12});
            add(new int[]{37, 34, 36, 52});
            add(new int[]{});
            add(new int[]{20,22,33});
        }};


        ArrayList<int[]> querySet = new ArrayList<int[]>() {{
            add(new int[]{1,3});
            add(new int[]{3,4});
            add(new int[]{3,1});
            add(new int[]{4,3});
            add(new int[]{5,5});
        }};

        // process queries
        processQueries(dataSet, querySet);
    }

    private static void processQueries(ArrayList<int[]> dataSet, ArrayList<int[]> querySet) {
        for (int[] query: querySet) {
            int line = query[0];
            int col = query[1];
            try {
                int[] dataLine = dataSet.get(line - 1);
                System.out.println(dataLine[col - 1]);
            } catch(Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
