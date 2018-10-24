package array;  // вычисление максимального и минимального числа в массиве с произвольным размером

import java.util.Random;

public class Array {

    static int size = 1;

    public static void main(String[] args) {
        Random rnd = new Random();
        size = rnd.nextInt((20) + 1); //указываем размер массива
        int arr[] = new int[size]; //обьявляем массив и размер

        for (int i = 0; i < arr.length; i++) {  //заполняем массив случ числами
            arr[i] = rnd.nextInt((20) + 1);
            System.out.println(arr[i]);

        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min = minim(min, arr[i]);
            max = max(max, arr[i]);

        }
        System.out.println("Минимальное число в массиве равно: " + min);
        System.out.println("Максимальное число в массиве равно: " + max);
    }

    static int minim(int x, int y) {
        size = 0;
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }

    static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
