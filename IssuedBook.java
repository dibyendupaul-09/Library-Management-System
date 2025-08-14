public class IssuedBook {
    private Member member;
    private Book book;
    private String issueDate;

    public IssuedBook(Member member, Book book, String issueDate) {
        this.member = member;
        this.book = book;
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "Issued Book [Member: " + member + ", Book: " + book + ", Issue Date: " + issueDate + "]";
    }
}
