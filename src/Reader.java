public class Reader {
    String fullName;
    Integer billNumber;
    String faculty;
    String birthDate;
    String phoneNumber;

    public Reader(String fullName, int billNumber, String faculty, String birthDate, String phoneNumber) {
        this(fullName);
        this.billNumber = billNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public Reader(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", billNumber=" + billNumber +
                ", faculty='" + faculty + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void takeBook(int amount) {
        System.out.println(fullName + " взял(а) " + amount + " книг(и)");
    }

    public void takeBook(String... books) {
        for (String book : books) {
            System.out.println(fullName + " взял(а) " + book);
        }
    }

    public void returnBook(int amount) {
        System.out.println(fullName + " вернул(а) " + amount + " книг(и)");
    }

    public void returnBook(String... books) {
        for (String book : books) {
            System.out.println(fullName + " взял(а) " + book);
        }
    }

    public static void main(String[] args) {
        Book encyclopedia = new Book("Большая советская энциклопедия", "Шмидт О.Ю.");
        Book adventures = new Book("Таинственный остров", "Жюль Верн");
        Book dictionary = new Book("Толковый словарь русского языка", "Ожегов С.И.");

        Reader reader1 = new Reader("Иванов И.И.", 10001, "Лингвистики", "21.01.01", "+7922348572");

        System.out.println(reader1);
        reader1.takeBook(3);
        reader1.takeBook(adventures.book, encyclopedia.book, dictionary.book);
        reader1.returnBook(2);
        reader1.returnBook(encyclopedia.book, dictionary.book);

    }
}

