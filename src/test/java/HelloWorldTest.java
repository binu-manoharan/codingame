import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Test for {@link HelloWorld}
 */
public class HelloWorldTest {
    @Test
    public void should_say_hello() throws Exception {
        final String hello = HelloWorld.sayHello();
        assertThat("String should say Hello World!", hello, is("Hello World!"));
    }
}
