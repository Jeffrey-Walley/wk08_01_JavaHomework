import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> bookList = List.of(
                new Book("Black Hole", "Charles Burns"),
                new Book("From Hell", "Alan Moore & Eddie Campbell"),
                new Book("Fantastic Four", "Jack Kirby & Stan Lee"),
                new Book("Elephantmen", "Ladron"),
                new Book("The Incal", "Alejandro Jodrowsky & Moebius"),
                new Book("The Spirit", "Eisner"),
                new Book("Bone", "Jeff Smith"),
                new Book("Planetary", "Warren Ellis & John Cassiday")
        );

        // System.out.println(bookList);
        // bookList.forEach(book -> System.out.println(book));       // stream - makes for a cleaner output
        bookList.forEach(book -> System.out.println(book.getTitle()));
    }
}
