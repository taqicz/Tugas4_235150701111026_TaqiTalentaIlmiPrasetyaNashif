public class TextBook extends Book implements BookOperations {

    private String subject;

    public TextBook(String title, String author, int year, String subject ){
        super(title, author, year);
        this.subject = subject;
    }

    public void borrowBook() {
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Textbook: " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Textbook: " + getTitle() + " is already borrowed.");
        }
    }

    public void returnBook(){
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Textbook: " + getTitle() + " returned successfully.");
        } else {
            System.out.println("Textbook: " + getTitle() + " was not borrowed.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject\t\t: "+ subject);
        System.out.println("Borrowed\t: " + super.isBorrowed());
    }

}
