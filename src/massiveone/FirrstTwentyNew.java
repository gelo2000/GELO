package massiveone;

/**
 * Создать два массива из 20 чисел. Первый массив проинициализировать четными числами.
 * Проинициализировать второй массив элементами первого массива при условии,
 * что индекс делится на 4 без остатка и элемент больше 3, но меньше 16.
 * Если условие не выполняется оставить элемент массива без изменения.
 */
public class FirrstTwentyNew {
    public static void main(String[] args) {
        int[] mass = new int[20];
        int[] array = new int[20];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = i * 2;
            System.out.print(mass[i] + "\t");
        }

        System.out.println();

        for (int i = 0; i < 20; i++) {
            if (i % 4 == 0 && mass[i] > 3 && mass[i] < 16) {
                array[i] = mass[i];
            }
            System.out.print(array[i] + "\t");
        }

    }
}
