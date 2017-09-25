package lesson25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
//        Matrix matrixCreator = new Matrix();
//        int[][] m1 = matrixCreator.createMatrix(2000,3000);
//        int[][] m2 = matrixCreator.createMatrix(3000,400);
//        int x = (int) System.currentTimeMillis();
//        int[][] m3 = matrixCreator.multiplyMatrix(m1,m2);
//        int y = (int) System.currentTimeMillis();
//        System.out.println(y-x);
        int i = 0;

        MatrixThreads matrixThreads = new MatrixThreads();
        Thread thread = new Thread(matrixThreads,"Matrix" + i);

        thread.start();

    }
}
