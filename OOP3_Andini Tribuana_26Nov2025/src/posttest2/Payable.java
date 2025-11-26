// Hint: Accounting implements Payable, methods can be public
package posttest2;

// interface ini bertindak sebagai kontrak.
public interface Payable {
    // method abstrak untuk menghitung gaji berdasarkan data karyawan
    double calculateSalary(Employee e);
}
