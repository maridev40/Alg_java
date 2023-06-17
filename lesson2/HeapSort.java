package lesson2;

import java.util.Random;

public class HeapSort {

    public static void main(String[] args) {
        int[] intArray = getArrayInt(7);
        Print(intArray);
        sort(intArray);
        Print(intArray);
    }

    public static void sort(int[] array) {
        //Построение кучи
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }

        for (int i = array.length - 1; i >=0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int lagest = rootIndex;
        int leftChild = rootIndex * 2 + 1;
        int rightChild = rootIndex * 2 + 2;

        if (leftChild < heapSize && array[leftChild] > array[lagest]) {
            lagest = leftChild;
        }
        
        if (rightChild < heapSize && array[rightChild] > array[lagest]) {
            lagest = rightChild;
        }
        
        if (lagest != rootIndex) {
            int temp = array[rootIndex];
            array[rootIndex] = array[lagest];
            array[lagest] = temp;   

            heapify(array, heapSize, lagest);
        }
    }

    public static int[] getArrayInt(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static void Print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("");
    }
}