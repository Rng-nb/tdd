import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {
    @Test
    void should_return_null_when_convert_given_string_null() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("");
        assertEquals("", result);
    }

    @Test
    void should_return_string_when_convert_given_string_vowels_not_more_than_30() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("abcdefghgh");
        assertEquals("abcdefghgh", result);
    }

    @Test
    void should_return_string_insert_mommy_when_convert_given_string_vowels_more_than_30_with_continuous_vowels() {
    Mommifier mommifier = new Mommifier();
    String result = mommifier.convert("aacdeeefgh");
    assertEquals("amommyacdemommyemommyefgh", result);
    }
}
