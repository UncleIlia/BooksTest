import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Tests {

    Book book = new Book(" нига джунглей", 1893, 400, new Author("–едь€рд", " иплинг", 10));

@Test
    public void HamcrestIsBigTest() {

    assertThat(book.isBig(), is(false));
}

@Test
    public void HamcrestMatchesTest(){

    final String word = " нига";

   assertThat(book.matches(word), is(true));
}

@Test
    public void HamcrestEstimatePriseTest() {

    assertThat(book.estimatePrise(), is(3600));
}

@Test
    public void HamcrestNotNullValue() {
    assertThat(book, notNullValue());
}

    @Test
    public void HamcrestStringCheck() {
        String string = "Petya";
        assertThat(string, anyOf(containsString("Pet"), endsWith("tya")));
    }
}
