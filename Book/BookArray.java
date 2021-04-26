package Book;
public class BookArray {
    public static void main(String[] args) {

        Book[] books = new Book[10];

        books[0] = new Fiction("Nineteen Eighty-four");
        books[1] = new NonFiction("A room of one's own");
        books[2] = new Fiction("The Great Gatsby");
        books[3] = new NonFiction("In Cold Blood");
        books[4] = new Fiction("The Lord of the Rings");
        books[5] = new NonFiction("Between the world and me");
        books[6] = new Fiction("The Book Thief");
        books[7] = new NonFiction("behind the beautiful forevers");
        books[8] = new Fiction("The Alchemist");
        books[9] = new NonFiction("Black Futures");

        for(int x = 0; x < books.length; ++x){
            System.out.println("BOOK: \"" + books[x].getTitle() + "\" IS $" + books[x].getBookPrice());
        }
    }
}