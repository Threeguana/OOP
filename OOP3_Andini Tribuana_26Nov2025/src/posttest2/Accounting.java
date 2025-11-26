package posttest2;

public class Accounting extends Employee implements Payable {

    public Accounting(String id, String name, String gender, int age) {
        super(id, name, gender, age, "Accounting");
    }

    // menghitung gaji dasar tanpa bonus
    @Override
    public double calculateSalary(Employee e) {
        if (this.getId().equals("A001")) {

            // cek role karyawan yang sedang dihitung gajinya
            if (e.getRole().equals("Staff")) {
                return 5000;
            } else if (e.getRole().equals("Manager")) {
                return 7000;
            }
        }
        return 0;
    }

    // method Overloading (nama sama, tapi parameter beda)
    // hitung gaji dgn bonus
    public double calculateSalary(Employee e, double bonusRate) {
        double baseSalary = calculateSalary(e);

        // Jika gaji dasar 0 berarti akses ditolak, tdk dpt bonus
        if (baseSalary == 0) {
            return 0;
        }

        return baseSalary + (baseSalary * bonusRate);
    }

    // Override method getEmployeeInfo milik Employee
    @Override
    public String getEmployeeInfo() {
        return super.getEmployeeInfo() + " Can calculate salaries for Staff & Manager";
    }
}
