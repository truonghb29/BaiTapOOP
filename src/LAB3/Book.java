package LAB3;

public class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }

    public Book (Book bo){
        this.boCode = bo.getBoCode();
        this.boTitle = bo.getBoTitle();
        this.boAuthor = bo.getBoAuthor();
    }

    public String getBoCode() {
        return boCode;
    }

    public void setBoCode(String boCode) {
        this.boCode = boCode;
    }

    public String getBoTitle() {
        return boTitle;
    }

    public void setBoTitle(String boTitle) {
        this.boTitle = boTitle;
    }

    public String getBoAuthor() {
        return boAuthor;
    }

    public void setBoAuthor(String boAuthor) {
        this.boAuthor = boAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "boCode='" + boCode + '\'' +
                ", boTitle='" + boTitle + '\'' +
                ", boAuthor='" + boAuthor + '\'' +
                '}';
    }
}
