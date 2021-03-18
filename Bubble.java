package Sorting;

import java.util.Random;

class Bubble {

    public static void main(String[] args) {
        int length = 100;
        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            nums[i] = gnrt();
        }
        int a, b, t;
        int size;
        size = nums.length; // количество сортируемыx элементов

        // Отобразить исходный массив
        System.out.print("Иcxoдный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        // Реализовать алгоритм пузырьковой сортировки
        for (a = 1; a < size; a++) {

            for (b = size - 1; b >= a; b--) {

                if (nums[b - 1] > nums[b]) {    // если требуемый порядок
                    // следования не соблюдается,
                    // поменять элементы местами

                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;

                    // Отобразить отсортированный массив
                    System.out.print("Oтcopтиpoвaнный массив:");
                    for (int i = 0; i < size; i++)
                        System.out.print(" " + nums[i]);
                    System.out.println();
                }
            }
        }
    }

    public static int gnrt() {
        return new Random().nextInt(999);
    }
}