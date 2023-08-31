import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    Book book = new Book("����� ��������", 1893, 400, new Author("�������", "�������", 10));

@Test
    public void isBigTest() {

    Assertions.assertFalse(book.isBig());
}

@Test
    public void matchesTest(){

    final String word = "�����";

    Assertions.assertTrue(book.matches(word));
}

@Test
    public void estimatePriseTest() {

    Assertions.assertEquals(3600, book.estimatePrise());
}
}
