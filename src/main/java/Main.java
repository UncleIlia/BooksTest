public class Main {

    public static void main(String[] args) {
	Book book1 = new Book("����� ��������",1893,50, new Author("�������","�������",10));
    Book book2 = new Book("�������",1559,544, new Author("����","�����", 20));
        System.out.println(book1.isBig());
        System.out.println(book2.isBig());
        System.out.println(book1.matches("�����") && book1.matches("�������"));
        System.out.println(book2.matches("�����") && book2.matches("�������"));
        System.out.println("����� ����� " + book1.estimatePrise() + " ������");
        System.out.println("����� ����� " + book2.estimatePrise() + " ������");
    }
}
