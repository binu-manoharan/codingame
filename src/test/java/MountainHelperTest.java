import org.junit.Test;

/**
 * Test for {@link MountainHelper}
 */
public class MountainHelperTest {
    @Test
    public void should_compile() throws Exception {
        final MountainHelper mountainHelper = new MountainHelper();
        final int mountains[] = {1, 2, 3, 4, 5, 6, 7, 8};

        mountainHelper.getHighestMountain(mountains);
    }
}
