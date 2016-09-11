package org.codingame.descent;

import java.util.OptionalInt;
import java.util.stream.IntStream;

/**
 * Helper class to work with mountain heights.
 */
class MountainHelper {

    int getHighestMountain(int[] mountains) {
        OptionalInt reduce = IntStream.range(0, mountains.length)
                .reduce((i, j) -> mountains[i] < mountains[j] ? j : i);
        if(reduce.isPresent()) {
            return reduce.getAsInt();
        }
        return -1;
    }
}
