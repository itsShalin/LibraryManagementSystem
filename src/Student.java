public class Student extends User {

    public Student(String username, String password) {
        super(username, password);
    }

    @Override
    public void showMenu() {

        System.out.println("\n===== STUDENT MENU =====");
        System.out.println("1. Display Books");
        System.out.println("2. Search Book");
        System.out.println("3. Borrow Book");
        System.out.println("4. Return Book");
        System.out.println("5. Logout");
    }


    public void useLibrary(Library library) {

        String choice = "";

        while (!choice.equals("5")) {

            showMenu();

            System.out.print("Enter your choice: ");
            choice = IO.readln();

            switch (choice) {

                case "1":
                    library.displayBooks();
                    break;

                case "2":
                    System.out.print("Enter Book ID to search: ");
                    String searchId = IO.readln();

                    library.searchBook(searchId);
                    break;

                case "3":
                    System.out.print("Enter Book ID to borrow: ");
                    String borrowId = IO.readln();

                    library.borrowBook(borrowId, getUsername());
                    break;

                case "4":
                    System.out.print("Enter Book ID to return: ");
                    String returnId = IO.readln();

                    library.returnBook(returnId, getUsername());
                    break;

                case "5":
                    System.out.println("Student logged out!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

}