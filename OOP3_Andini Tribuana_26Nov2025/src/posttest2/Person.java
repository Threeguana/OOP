// Hint: id, name, gender, age should be private
package posttest2;

public class Person { // harus private
    private String id;
    private String name;
    private String gender;
    private int age;

    public Person(String id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getInfo() {
        return name + " (" + gender + ", " + age + ")";
    }
}
