package QuestionsPractice.Questions.Question80;

public class Books extends LibraryItem {
    long ISBN;
    long issueNumber;


    @Override
    public String toString() {
        return "ISBN = " + ISBN + "\nIssueNumber = " + issueNumber;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

}
