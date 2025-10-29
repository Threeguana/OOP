package dataStructure;

import static org.junit.Assert.*;
import org.junit.Test;

public class ArrayMinMax {
    public int[] findMinMax(int[] array) {
        if (array.length == 0) {
            // jika array kosong, kembalikan nilai default
            // misal (min = integer.MAX_VALUE dan max = integer.MIN_VALUE)
            return new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE };
        }
        // Menganggap elemen pertama sebagai nilai min dan max
        int min = array[0];
        int max = array[0];

        // Mengiterasi array untuk mencari nilai minimum dan maksimum
        for (int num : array) {
            if (num < min)
                min = num; // Menemukan nilai terkecil
            if (num > max)
                max = num; // MenemuA.JAVA
                // kan nilai terbesar
        }

        // Mengembalikan nilai min dan max dalam array
        return new int[] { min, max };
    }
}
