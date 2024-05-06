public class Novel extends Book implements BookOperations {

    private String genre;

    public Novel(String title, String author, int year, String genre){
        super(title, author, year);
        this.genre = genre;
    }

    public void borrowBook(){
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Novel: " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Novel: " + getTitle() + " is already borrowed.");
        }
    }

    public void returnBook(){
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Novel: " + getTitle() + " returned successfully.");
        } else {
            System.out.println("Novel: " + getTitle() + " was not borrowed.");
        }
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Genre\t\t: "+ genre);
        System.out.println("Borrowed\t: " + super.isBorrowed());
        
    }
}
