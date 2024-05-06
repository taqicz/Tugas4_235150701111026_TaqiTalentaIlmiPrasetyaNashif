public class Magazine extends Book implements BookOperations {

    private String category;

    public Magazine(String title, String author, int year, String category){
        super(title,author,year);
        this.category = category;
    }

    @Override
    public void borrowBook(){
        if (!isBorrowed()) {
            setBorrowed(true);
            System.out.println("Magazine: " + getTitle() + " borrowed successfully.");
        } else {
            System.out.println("Magazine: " + getTitle() + " is already borrowed.");
        }
    }

        @Override
    public void returnBook(){
        if (isBorrowed()) {
            setBorrowed(false);
            System.out.println("Magazine: " + getTitle() + " returned successfully.");
        } else {
            System.out.println("Magazine: " + getTitle() + " was not borrowed.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Category\t: "+category);
        System.out.println("Borrowed\t: " + super.isBorrowed());
    }
    
}
