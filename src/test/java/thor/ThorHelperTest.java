package thor;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

/**
 * Test for {@link ThorHelper}
 */
public class ThorHelperTest {

    private int lightX =  10;
    private int lightY = 10;
    private int thorX = 10;
    private int thorY = 10;

    @Test
    public void thor_should_go_west() throws Exception {
        ThorHelper thorHelper = new ThorHelper();
        thorX = 12;

        String direction = thorHelper.getNextDirection(lightX, lightY, thorX, thorY);
        assertDirection(direction, "Thor should go west", is("W"));
    }

    @Test
    public void thor_should_go_east() throws Exception {
        ThorHelper thorHelper = new ThorHelper();
        lightX = 12;

        String direction = thorHelper.getNextDirection(lightX, lightY, thorX, thorY);
        assertDirection(direction, "Thor should go east", is("E"));
    }

    @Test
    public void thor_should_go_north() throws Exception {
        ThorHelper thorHelper = new ThorHelper();
        thorY = 8;

        String direction = thorHelper.getNextDirection(lightX, lightY, thorX, thorY);
        assertDirection(direction, "Thor should go north", is("N"));
    }

    private void assertDirection(String direction, String reason, Matcher<String> e) {
        assertThat(reason, direction, is(notNullValue()));
        assertThat(reason, direction, e);
    }
}
