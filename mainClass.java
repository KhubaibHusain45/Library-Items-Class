package QuestionsPractice.Questions.Question80;

public class mainClass {
    public static void main(String[] args) {
        LibraryItem LI = new LibraryItem();
        LI.author = "John Doe";
        LI.title = "Java Books";
        LI.ItemID = 32049;
        LI.checkOut();
        System.out.println(LI);
        LI.returnItem();

        System.out.println("--------------------------------------------");

        Books book = new Books();
        book.setISBN(3241);
        book.setAuthor("Musharraf");
        book.setTitle("In the line of fire");
        System.out.println(book);

        System.out.println("--------------------------------------------");

        Magazine mag = new Magazine();
        mag.setISBN(32676);
        mag.setIssueNumber(112);
        System.out.println(mag);
    }
}
