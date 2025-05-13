package QuestionsPractice.Questions.Question80;

public class LibraryItem {
    String title;
    String author;
    long ItemID;
    int noOfBooksBorrowed=0;

    @Override
    public String toString() {
        return "Title = " + title + "\nAuthor = " + author + "\nItemID = " + ItemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getItemID() {
        return ItemID;
    }

    public void setItemID(long itemID) {
        ItemID = itemID;
    }

    public void checkOut() {
        System.out.println(ItemID + " has been checked out successfully");
    }

    public void returnItem() {
        System.out.println(ItemID + " has been returned successfully");
    }

}
