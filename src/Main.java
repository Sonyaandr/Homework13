public class Main {
    public static void main(String[] args) {
        Book newBook = new Book("Путешествие", "Иванов", 1999);
        System.out.println("Название книги" + newBook.getNameBook());
        System.out.println("автор книги" + newBook.getAuthor());
        newBook.setYearPublic(2004);
        System.out.println("Год публикации книги" + newBook.getYearPublic());

        Author author = new Author("Иванов", "Иван");
        System.out.println("Имя автора книги" + author.getNameAuthor());
        System.out.println("Фамилия автора книги" + author.getSurnameAuthor());

        System.out.println(newBook);
        System.out.println(author);
    }
}