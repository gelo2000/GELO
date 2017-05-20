package lessons;

import java.util.Random;

/**
 * Created by oleg on 20.05.17.
 */
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
//        System.out.println(random.nextInt(20));
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(20);//((max - min) + 1) + min
//            array[i] = random.nextInt(20 - 10 + 1) + 10;
            array[i] = (int)((Math.random() * 10) + 15);//0.2, 0.5

            System.out.print(array[i] + " ");
        }
    }
}
