package lessons.two_dimension_array;

import java.util.Random;

/**
 * Created by oleg on 20.05.17.
 */
public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] array = {
                {4},
                {7, 9, 4},
                {1, 2, 3, 4}
        };

        /*int[][] array2 = new int[2][3];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/

        Random random = new Random();

        int[][] massiv = new int[4][4];//0

        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                massiv[i][j] = random.nextInt(15);
                System.out.print(massiv[i][j] + "\t");
            }
            System.out.println();
        }

//        iter 0: i == 0 - outer loop:
//        iter0: j == 0, massiv[0][0] == 11
//        iter1: j == 1, massiv[0][1] == 9

    }
}
