import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Member> members = new ArrayList<>();
    private static ArrayList<IssuedBook> issuedBooks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Library Management System ====");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. View All Books");
            System.out.println("6. View All Members");
            System.out.println("7. View Issued Books");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addBook(scanner);
                    break;
                case 2:
                    registerMember(scanner);
                    break;
                case 3:
                    issueBook(scanner);
                    break;
                case 4:
                    returnBook(scanner);
                    break;
                case 5:
                    viewBooks();
                    break;
                case 6:
                    viewMembers();
                    break;
                case 7:
                    viewIssuedBooks();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    private static void addBook(Scanner scanner) {
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String author = scanner.nextLine();
        books.add(new Book(title, author));
        System.out.println("Book added successfully!");
    }

    private static void registerMember(Scanner scanner) {
        System.out.print("Enter Member Name: ");
        String name = scanner.nextLine();
        members.add(new Member(name));
        System.out.println("Member registered successfully!");
    }

    private static void issueBook(Scanner scanner) {
        System.out.print("Enter Book ID: ");
        int bookId = scanner.nextInt();
        System.out.print("Enter Member ID: ");
        int memberId = scanner.nextInt();
        scanner.nextLine(); // clear buffer
        System.out.print("Enter Issue Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        Book book = findBookById(bookId);
        Member member = findMemberById(memberId);

        if (book != null && member != null && !book.isIssued()) {
            book.setIssued(true);
            issuedBooks.add(new IssuedBook(member, book, date));
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Invalid Book/Member ID or Book already issued.");
        }
    }

    private static void returnBook(Scanner scanner) {
        System.out.print("Enter Book ID to return: ");
        int bookId = scanner.nextInt();

        Book book = findBookById(bookId);
        if (book != null && book.isIssued()) {
            book.setIssued(false);
            issuedBooks.removeIf(ib -> ib.toString().contains("Book ID: " + bookId));
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book not found or not issued.");
        }
    }

    private static void viewBooks() {
        System.out.println("\nList of Books:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    private static void viewMembers() {
        System.out.println("\nList of Members:");
        for (Member m : members) {
            System.out.println(m);
        }
    }

    private static void viewIssuedBooks() {
        System.out.println("\nIssued Books:");
        for (IssuedBook ib : issuedBooks) {
            System.out.println(ib);
        }
    }

    private static Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    private static Member findMemberById(int id) {
        for (Member m : members) {
            if (m.getId() == id) return m;
        }
        return null;
    }
}
