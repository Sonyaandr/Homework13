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

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return nameBook.equals(c2.nameBook);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameBook);
    }
}