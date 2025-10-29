package dataStructure;

public class SequentialSearch {
    // method untuk mencari nilai dalam array menggunakan sequential search
    public int[] sequentialSearch(int[] array, int target) {
        // iterasi melalui setiap elemen dalam array
        for (int i = 0; i < array.length; i++) {
            // memeriksa apakah elemen saat ini sama dengan targetnya
            if (array[i] == target) {
                // jika ditemukan, kembalikan indeks ke (i) dan jumlah iterasi (i + 1)
                return new int[] { i, i + 1 };
            }
        }
        // jika loop selesai dan target tidak ditemukan,
        // kmbalikan -1 untuk indeks dan total iterasi (panjang array)
        return new int[] { -1, array.length };
    }
}
