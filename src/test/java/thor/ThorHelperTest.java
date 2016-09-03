package thor;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

/**
 * Test for {@link ThorHelper}
 */
public class ThorHelperTest {
    @Test
    public void thor_should_go_west() throws Exception {
        ThorHelper thorHelper = new ThorHelper();
        final int lightX = 10;
        final int lightY = 10;
        final int thorX = 12;
        final int thorY = 10;

        String direction = thorHelper.getNextDirection(lightX, lightY, thorX, thorY);
        assertThat("Thor should go west", direction, is(notNullValue()));
        assertThat("Thor should go west", direction, is("W"));
    }
}
