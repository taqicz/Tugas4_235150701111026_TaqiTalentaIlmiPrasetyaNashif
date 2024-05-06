public class Main {
    public static void main(String[] args) {

        TextBook textbook = new TextBook("Java Programming", "John Smith", 2020, "Computer Science");
        Novel novel = new Novel("To Kill a Mocking bird", "Harper Lee", 1960, "Fiction");
        Magazine magazine = new Magazine("National Geographic", "Various", 2021, "Science");

    
        System.out.println("\n-------Book Information-------");
        textbook.displayInfo();
        novel.displayInfo();
        magazine.displayInfo();

        System.out.println();

        System.out.println("\n-----Borrowing and Returning Books------\n");
        textbook.borrowBook();
        magazine.borrowBook();
        textbook.returnBook();
        novel.returnBook();
    }
}