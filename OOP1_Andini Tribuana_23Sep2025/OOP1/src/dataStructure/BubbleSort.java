package dataStructure;

public class BubbleSort {
    // Method untuk mengurutkan array menggunakan bubble sort dengan batasan iterasi
    public int[] bubbleSort(int[] array, int max) {
        int n = array.length;
        // Melakukan iterasi sebanyak max iterasi
        for (int i = 0; i < max; i++) {
            // Melakukan perbandingan
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Menukar elemen jika urutannya salah
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        // Mengembalikan array setelah diurutkan sesuai batasan iterasi
        return array;
    }
}
