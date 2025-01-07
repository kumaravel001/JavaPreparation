package com.ktech.java_challenges;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FlippingTheMatrix {

    public static void main(String[] args) {

        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(112,42,83,119));
        matrix.add(Arrays.asList(56,125,56,49));
        matrix.add(Arrays.asList(15, 78, 101, 43));
        matrix.add(Arrays.asList(62, 98, 114, 108))
        ;
        boolean isColumnToFlip = true;

        for (int m = 0; m < matrix.size(); m++) {
            for (int l = 0; l < matrix.size() / 2; l++) {
                if (matrix.get(l).get(m) > matrix.get(matrix.size() - 1 - l).get(m)) {
                    isColumnToFlip = false;
                    break;
                }
            }
            if (isColumnToFlip) {
                verticalListReverse(matrix, m + 1);
            }
            isColumnToFlip = true;
        }

        boolean isRowToFlip = true;


        for (int a = 0; a < matrix.size(); a++) {
            for (int b = 0; b < matrix.size() / 2; b++) {
                if (matrix.get(a).get(b) > matrix.get(a).get(matrix.size() - 1 - b)) {
                    isRowToFlip = false;
                    break;
                }

            }
            if (isRowToFlip) {
                horizontalListReverse(matrix, a + 1);
            }
            isRowToFlip = true;

        }
        int sum = 0;
        for(int d=0; d<matrix.size()/2;d++)
        {
            for(int e =0; e<matrix.size()/2; e++)
            {
                sum += matrix.get(d).get(e);
            }
        }

        System.out.println(sum);
    }

    private static void verticalListReverse(List<List<Integer>> matrix, int columnToFlip) {
        for (int j = 0; j < matrix.size() / 2; j++) {
            int temp = matrix.get(j).get(columnToFlip - 1);
            matrix.get(j).set(columnToFlip - 1, matrix.get(matrix.size() - 1 - j).get(columnToFlip - 1));
            matrix.get(matrix.size() - 1 - j).set(columnToFlip - 1, temp);
        }
    }

    private static void horizontalListReverse(List<List<Integer>> matrix, int rowsToFlip) {
        List<Integer> list = matrix.get(rowsToFlip - 1);

        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
    }


}
