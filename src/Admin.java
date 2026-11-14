public class Admin extends User {

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void showMenu() {

        System.out.println("\n===== ADMIN MENU =====");
        System.out.println("1. Add Book");
        System.out.println("2. Display Books");
        System.out.println("3. Search Book");
        System.out.println("4. Remove Book");
        System.out.println("5. Logout");
    }


    public void manageLibrary(Library library) {

        String choice = "";

        while (!choice.equals("5")) {

            showMenu();

            System.out.print("Enter your choice: ");
            choice = IO.readln();

            switch (choice) {

                case "1":
                    System.out.print("Enter Book ID: ");
                    String id = IO.readln();

                    System.out.print("Enter Book Title: ");
                    String title = IO.readln();

                    System.out.print("Enter Author Name: ");
                    String author = IO.readln();

                    Book book = new Book(id, title, author);
                    library.addBook(book);
                    break;

                case "2":
                    library.displayBooks();
                    break;

                case "3":
                    System.out.print("Enter Book ID to search: ");
                    String searchId = IO.readln();

                    library.searchBook(searchId);
                    break;

                case "4":
                    System.out.print("Enter Book ID to remove: ");
                    String removeId = IO.readln();

                    library.removeBook(removeId);
                    break;

                case "5":
                    System.out.println("Admin logged out!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

}