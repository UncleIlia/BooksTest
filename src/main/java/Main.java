public class Main {

    public static void main(String[] args) {
	Book book1 = new Book("Книга джунглей",1893,50, new Author("Редьярд","Киплинг",10));
    Book book2 = new Book("Капитал",1559,544, new Author("Карл","Маркс", 20));
        System.out.println(book1.isBig());
        System.out.println(book2.isBig());
        System.out.println(book1.matches("Книга") && book1.matches("Редьярд"));
        System.out.println(book2.matches("Книга") && book2.matches("Редьярд"));
        System.out.println("Книга стоит " + book1.estimatePrise() + " рублей");
        System.out.println("Книга стоит " + book2.estimatePrise() + " рублей");
    }
}
