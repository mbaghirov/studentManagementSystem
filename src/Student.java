public class Student {
    String name;
    int age;
    int grade;

    Util input = new Util();

    public Student(String initialName, int initialAge, int initialGrade) {
        this.name = initialName;
        this.age = initialAge;
        this.grade = initialGrade;
    }
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade + ".");

    }
}
