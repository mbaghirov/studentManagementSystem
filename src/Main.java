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
                    ===== Student Management System =====
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
        case 1:
          classRoom.addStudent();
          break;
        case 2:
          classRoom.showStudents();
          break;
        case 3:
          classRoom.searchStudent();
          break;
        case 4:
          classRoom.deleteStudent();
          break;
        case 5:
          classRoom.calculateAverage();
          break;
        case 0:
          input.systemOutPrint("\nProgram exit");
          break;
        default:
          input.systemOutPrint("\nPlease, correct choice!\n");
      }
    } while (choice != 0);
  }
}
