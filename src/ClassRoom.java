public class ClassRoom {
  Student[] students = new Student[100];
  int count = 0;

  Util input = new Util();

  /// Telebe elave etmek ucun
  void addStudent() {
    input.systemOutPrint("\nPlease, Enter your student's information");

    String name = input.requiredText("Student's name:");
    int age = input.requiredNumber("Student's age:");
    int grade = input.requiredNumber("Student's grade:");

    students[count] = new Student(name, age, grade);
    count++;
    System.out.println("\nStudent information added successfully!!!");
    input.showReturnToMenuText();
  }

  /// Siyahini gostermek
  void showStudents() {
    if (count != 0) {
      for (int i = 0; i < count; i++) {
        students[i].displayInfo();
      }
      input.showReturnToMenuText();
    } else {
      System.err.println("\nThe list is empty");
    }
  }

  /// Telebe tapmaq ucuns
  void searchStudent() {
    String searchName = input.requiredText("\nPlease, enter the student information you need: ");

    boolean found = false;

    for (int i = 0; i < count; i++) {
      if (students[i] == null) {
        break;
      }
      if (students[i].name.equalsIgnoreCase(searchName)) {
        students[i].displayInfo();
        found = true;
        System.err.println("Student found");
        input.showReturnToMenuText();
        break;
      }
    }

    if (!found) {
      System.err.println("\nStudent not found");
    }
  }

  /// Telebe silmek uchun
  void deleteStudent() {
    String deletedStudent = input.requiredText("\nWhich do you want to delete student");

    boolean found = false;
    for (int i = 0; i < count; i++) {
      if (students[i].name.equalsIgnoreCase(deletedStudent)) {
        students[i] = students[count - 1];
        students[count - 1] = null;
        count--;
        found = true;
        System.err.println("\nStudent delete");
        input.showReturnToMenuText();
        break;
      }
    }

    if (!found) {
      System.err.println("\nStudent not found");
    }
  }

  /// Ortalama bali hesablama
  void calculateAverage() {
    if (count == 0) {
      System.err.println("\nHesablamaq üçün tələbə yoxdur");
      return;
    }

    double sum = 0;
    for (int i = 0; i < count; i++) {
      sum += students[i].grade;
    }
    double avg = sum / count;
    input.systemOutPrint("\nAverage grade: " + avg);
    input.showReturnToMenuText();
  }
}
