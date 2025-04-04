package controller;

public class ShellSort {

    public void sort(int[] arr, boolean ascendente) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            int contCambios = 0;

            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;
                while (j >= gap && (
                        (ascendente && arr[j - gap] > temp) ||
                        (!ascendente && arr[j - gap] < temp))) {

                    arr[j] = arr[j - gap];
                    j -= gap;
                    contCambios++;
                }

                arr[j] = temp;
            }

            System.out.println("\n" + contCambios + " cambios en gap: " + gap);
        }
    }

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
}
