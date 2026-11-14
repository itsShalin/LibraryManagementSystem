
import java.util.ArrayList;

void main() {

    Library library = new Library();

    ArrayList<Student> students = new ArrayList<>();

    Admin admin = new Admin("admin", "admin123");

    String choice = "";

    while (!choice.equals("5")) {

        IO.println("\n========================================");
        IO.println("       LIBRARY MANAGEMENT SYSTEM");
        IO.println("========================================");

        IO.println("1. Admin Login");
        IO.println("2. Student Registration");
        IO.println("3. Student Login");
        IO.println("4. Library Information");
        IO.println("5. Exit");

        IO.println("----------------------------------------");
        IO.print("Enter your choice: ");

        choice = IO.readln();

        switch (choice) {

            case "1":

                IO.print("Enter admin username: ");
                String adminUsername = IO.readln();

                IO.print("Enter admin password: ");
                String adminPassword = IO.readln();

                if (admin.login(adminUsername, adminPassword)) {

                    IO.println("\nLogin successful!");

                    admin.manageLibrary(library);

                } else {

                    IO.println("Invalid username or password!");
                }

                break;



            case "2":

                IO.print("Enter student username: ");
                String studentUsername = IO.readln().trim();

                if (studentUsername.isEmpty()) {

                    IO.println("Username cannot be empty!");

                } else {

                    boolean usernameExists = false;

                    for (Student student : students) {

                        if (student.getUsername().equalsIgnoreCase(studentUsername)) {
                            usernameExists = true;
                            break;
                        }
                    }

                    if (usernameExists) {

                        IO.println("This username is already taken!");

                    } else {

                        IO.print("Enter student password: ");
                        String studentPassword = IO.readln();

                        if (studentPassword.trim().isEmpty()) {

                            IO.println("Password cannot be empty!");

                        } else {

                            Student newStudent = new Student(studentUsername, studentPassword);

                            students.add(newStudent);

                            IO.println("Student registered successfully!");
                        }
                    }
                }

                break;



            case "3":

                IO.print("Enter student username: ");
                String loginUsername = IO.readln();

                IO.print("Enter student password: ");
                String loginPassword = IO.readln();

                boolean found = false;

                for (Student student : students) {

                    if (student.login(loginUsername, loginPassword)) {

                        IO.println("\nStudent login successful!");

                        student.useLibrary(library);

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    IO.println("Invalid username or password!");
                }

                break;

            case "4":
                IO.println("\n===== LIBRARY INFORMATION =====");
                IO.println("Welcome to our Library Management System!");
                break;

            case "5":
                IO.println("Thank you for visiting our library!");
                break;

            default:
                IO.println("Invalid choice! Please try again.");
        }
    }
}
