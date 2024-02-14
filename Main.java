class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public void displayInfo(){
        System.out.println("Title:" + title + "," + "Author:" + author + "," + "Year:" + year);

    }
}

    public class Main {
        public static void main(String[] args) {
            Book b = new Book("Java Programming","John Smith",2022);
            b.displayInfo();
        }
    }
