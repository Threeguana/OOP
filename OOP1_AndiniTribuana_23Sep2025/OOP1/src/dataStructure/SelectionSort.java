package dataStructure;

public class SelectionSort {
    public int[] selectionSort(int[] array, int max) {
        int n = array.length;
        // batasi jumlah iterasi agar tidak melebihi panjang array
        int iterations = Math.min(max, n);

        // iterasi utama untuk memilih elemen yang akan diurutkan
        for (int i = 0; i < iterations; i++) {
            int minIndex = i;
            // iterasi untuk mencari elemen terkecil di sisa array
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // tukar elemen terkecil yang ditemukan dengan elemen di posisi i
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        // mengembalikan array yang telah diurutkan sebagian atau seluruhnya
        return array;
    }
}
