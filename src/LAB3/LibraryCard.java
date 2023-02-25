package LAB3;

public class LibraryCard {

    private long lbCode;
    private String owner;
    private int borrowCount;

    public LibraryCard() {
        this.lbCode = 0;
        this.owner = "";
        this.borrowCount = 0;
    }

    public LibraryCard(long lbCode, String owner, int borrowCount) {
        this.lbCode = lbCode;
        this.owner = owner;
        this.borrowCount = borrowCount;
    }

    public long getLbCode() {
        return lbCode;
    }

    public void setLbCode(long lbCode) {
        this.lbCode = lbCode;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void checkOut(int num) {
        this.borrowCount++;
    }

    @Override
    public String toString() {
        return "LibraryCard{" +
                "lbCode=" + lbCode +
                ", owner='" + owner + '\'' +
                ", borrowCount=" + borrowCount +
                '}';
    }
}
