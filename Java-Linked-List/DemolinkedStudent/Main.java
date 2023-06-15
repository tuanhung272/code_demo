package DemolinkedStudent;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyList ml = new MyList();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Make your choice! ");
        while (true){
            System.out.print(" 1.Add Student. \n 2.Delete Student. \n 3.Edit Student. \n 4.List Student. \n 5.Search Student. \n 6.Quit.\nMy choice: ");
            if (sc.hasNextInt())
            {
                int selected = sc.nextInt();
                sc.nextLine();
                switch (selected){
                    case 1:
                        System.out.print("Enter Student ID: ");
                        int StudentID = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String StudentName = sc.nextLine();

                        System.out.print("Enter Student Age: ");
                        int StudentAge = sc.nextInt();
                        sc.nextLine();

                        Student student = new Student(StudentID, StudentName, StudentAge);
                        Node node = new Node(student);
                        ml.add(node);
                        break;
                    case 2:
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        ml.removeById(id);
                        System.out.println("After removing the student with ID " + id + " : ");
                        ml.traverse();
                        break;
                    case 3:
                        System.out.print("Enter Student ID: ");
                        int id_Student_Edit = sc.nextInt();
                        sc.nextLine();
                        boolean editById = ml.editById(id_Student_Edit);
                        if (editById){
                            System.out.println("Student information updated successfully.");
                        }else {
                            System.out.println("Student ID not found.");
                        }
                        break;
                    case 4:
                        ml.traverse();
                        break;
                    case 5:
                        System.out.print("Enter Student ID: ");
                        int id_Student_Search = sc.nextInt();
                        sc.nextLine();
                        Student foundStudent = ml.findStudentById(id_Student_Search);
                        if (foundStudent != null) {
                            System.out.println("---Found Student---");
                            System.out.println("ID: " + foundStudent.getStudentId());
                            System.out.println("Name: " + foundStudent.getStudentName());
                            System.out.println("Age: " + foundStudent.getStudentAge());
                        } else {
                            System.out.println("Student not found with ID: " + id_Student_Search);
                        }
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Your selection does not exist!");
                }
                if (selected == 6){
                    break;
                }
            }else {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.nextLine();
            }
        }
    }
}
