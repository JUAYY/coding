public class BookDemo {
    public static void main(String[] args) {
        Book b = new Book("Develope Java Software", "Russel", 79.75);
        System.out.println("Title book : " +b.getTitle());
        System.out.println("Author name : " +b.getAuthor());
        System.out.println("Price : "+b.getPrice());
    }
}
