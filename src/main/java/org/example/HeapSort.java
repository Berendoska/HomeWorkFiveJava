package org.example;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[] {1,55, 698, 8, 0, 147, 33};
        System.out.println("Сырой массив " + arr);
        heapSort(arr);
        System.out.println("Отсортированный массив " );
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i] + " ");
        }

    }

    private static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapFy(arr, i, n);
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapFy(arr, 0, i);
        }
    }

    private static void heapFy(int[] arr, int i, int n) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int parent = i;

        if (left < n && arr[left] > arr[parent])
            parent = left;
        if (right < n && arr[right] > arr[parent])
            parent = right;
        if (i != parent) {
            int temp = arr[i];
            arr[i] = arr[parent];
            arr[parent] = temp;

            heapFy(arr, parent, n);

        }
    }
}
