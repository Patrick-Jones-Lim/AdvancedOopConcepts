package Book;

public class NonFiction extends Book {

    public NonFiction(String title) {
        super(title);
        setBookPrice();
    }

    private void setBookPrice() {
        bookPrice = 27.99;
    }
}