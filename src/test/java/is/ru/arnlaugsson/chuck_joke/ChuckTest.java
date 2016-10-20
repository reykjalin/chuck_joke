package is.arnlaugsson.chuck_joke;

import static org.junit.Assert.assertNotEquals;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.Test;


public class ChuckTest {

    @Test
    public void randomJokeContainsName() {
        Chuck chuck = new Chuck();
        // assertThat(chuck.random(), containsString("Chuck Norris"));
        assertNotEquals(chuck.random().length(), 0);
    }
}
