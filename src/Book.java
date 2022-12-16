public class Book {
    String autor;
    String book;

    public Book(String book, String autor) {
        this.autor = autor;
        this.book = book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "autor: " + autor +
                "'book'" + book +
                '}';
    }
}
