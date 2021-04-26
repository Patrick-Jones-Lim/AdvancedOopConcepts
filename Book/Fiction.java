package Book;
public class Fiction extends Book {

    public Fiction(String title) {
        super(title);
        setBookPrice();
    }

    private void setBookPrice() {
        bookPrice = 24.99;
    }
}
