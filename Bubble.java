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
        size = nums.length; // ���������� ����������x ���������

        // ���������� �������� ������
        System.out.print("�cxo���� ������:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        // ����������� �������� ����������� ����������
        for (a = 1; a < size; a++) {

            for (b = size - 1; b >= a; b--) {

                if (nums[b - 1] > nums[b]) {    // ���� ��������� �������
                    // ���������� �� �����������,
                    // �������� �������� �������

                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;

                    // ���������� ��������������� ������
                    System.out.print("O�cop��po�a���� ������:");
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