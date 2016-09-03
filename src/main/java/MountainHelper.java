import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Helper class to work with mountain heights.
 */
public class MountainHelper {

    public int getHighestMountain(int[] mountains) {
        return IntStream.range(0,mountains.length)
                .reduce((i,j) -> mountains[i] < mountains[j] ? j : i)
                .getAsInt();
    }
}
