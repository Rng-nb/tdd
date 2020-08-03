import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MommifierTest {
    @Test
    void should_return_null_when_convert_given_string_null() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("");
        assertEquals("", result);
    }
}
