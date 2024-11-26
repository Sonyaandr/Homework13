public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String nameAuthor, String surnameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurnameAuthor() {
        return this.surnameAuthor;
    }
@Override
    public String toString() {
        return "Имя автора " + this.nameAuthor + ", Фамилия автора " + this.surnameAuthor;
    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c3 = (Author) other;
        return nameAuthor.equals(c3.nameAuthor);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(nameAuthor);
    }
}

