public class Book {
    public String title;
    public int releaseYear;
    public int pages;
    Author author;

    public Book(String title, int releaseYear, int pages, Author author) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.author = author;
    }

    public boolean isBig() {
        if (pages > 500){
            return true;
        } else {
            return false;
        }
    }

    public boolean matches(String word) {
        if (title.contains(word) || author.name.contains(word) || author.surname.contains(word)) {
            return true;
        } else {
            return false;
        }
    }
    public int estimatePrise() {
        int price = (3 * pages) * ((int) Math.floor(Math.sqrt(author.rating)));
        if (price < 250) {
            return 250;
        } else {
            return price;
        }
    }
}
