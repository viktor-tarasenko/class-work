package lesson25;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;


public class Matrix {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Random random = new Random();
    private int x;
    private int y;
    private int[][] matrix;

    public int[][] createMatrix(int x, int y) {
        matrix = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = random.nextInt(5) + 1;
            }
        }
        return matrix;
    }

    public int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                int sum = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }
        System.out.println("Finished");

        return result;
    }
}
