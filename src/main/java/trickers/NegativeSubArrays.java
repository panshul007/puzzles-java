package trickers;

import java.util.Scanner;

/**
 * Solution to number of Negative Sub arrays
 * Problem Url: https://www.hackerrank.com/challenges/java-negative-subarray/problem
 */
public class NegativeSubArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] input = new int[len];
        for(int i=0;i<len;i++) {
            input[i] = sc.nextInt();
        }

        int count = 0;
        for (int i=0;i<len;i++) {
            int sum = 0;
            for (int j=i;j<len;j++) {
                sum+=input[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
