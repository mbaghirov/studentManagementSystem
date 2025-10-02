import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ClassRoom classRoom = new ClassRoom();
    Util input = new Util();

    int choice = 0;

    do {
      input.systemOutPrint(
          """
                    \n===== Student Management System =====
                    1. Student add
                    2. Show students
                    3. Search student
                    4. Delete student
                    5. Calculate average
                    0. Exit
                    """);

      input.systemOutPrint("Please, select the menu item");
      choice = sc.nextInt();

      switch (choice) {
        case 1 -> classRoom.addStudent();
        case 2 -> classRoom.showStudents();
        case 3 -> classRoom.searchStudent();
        case 4 -> classRoom.deleteStudent();
        case 5 -> classRoom.calculateAverage();
        case 0 -> System.err.println("\nProgram exit");
        default -> System.err.println("\nPlease, correct choice!\n");
      }
    } while (choice != 0);
  }
}
