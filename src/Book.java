public class Book {
    public static void main(String[] args) {

        Livre monLivre = new Livre("Enfant sage", "Mael K", 225, "Mk");
        System.out.println( monLivre.author );
    }

}


class Livre{
    String title;
    String author;
    int numberOfPages;
    String publisher="OC";

    public Livre(String title, String author, int numberOfPages, String publisher) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }
}