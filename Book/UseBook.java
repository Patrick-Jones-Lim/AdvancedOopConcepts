package Book;

public class UseBook {

    public static void main(String[] args) {

        Book[] books = new Book[6];

        books[0] = new Fiction("Nineteen Eighty-four");
        books[1] = new NonFiction("A room of one's own");
        books[2] = new Fiction("The Great Gatsby");
        books[3] = new NonFiction("In Cold Blood");
        books[4] = new Fiction("The Lord of the Rings");
        books[5] = new NonFiction("Between the world and me");

        for(int x = 0; x < books.length; ++x){
            System.out.println("BOOK: \"" + books[x].getTitle() + "\" IS $" + books[x].getBookPrice());
        }
    }
}
