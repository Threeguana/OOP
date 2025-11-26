// Hint: role should be protected so subclasses can override
package posttest2;

public class Employee extends Person { // mewarisi person
    // bisa diakses oleh class ini dan class turunannya
    protected String role;

    public Employee(String id, String name, String gender, int age, String role) {
        super(id, name, gender, age);
        this.role = role;
    }

    // getter
    public String getRole() {
        return role;
    }

    public String getEmployeeInfo() {
        return getInfo() + " | Role: " + role;
    }
}
