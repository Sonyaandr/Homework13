public class Book {
    private String nameBook;
    private String author;
    private int yearPublic;

    public Book(String nameBook, String author, int yearPublic) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYearPublic() {
        return this.yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }
@Override
    public String toString() {
        return "Название книги " + this.nameBook + ", автор " + this.author + ", Дата публикации " + this.yearPublic;
    }
}