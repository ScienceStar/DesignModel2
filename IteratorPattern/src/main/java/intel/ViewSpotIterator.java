package intel;

import intel.impl.WyViewSpot;

/**
 * @ClassName ViewSpotIterator
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 11:29
 * @Version V1.0
 **/
public interface ViewSpotIterator {
    boolean hasNext();

    WyViewSpot first();

    WyViewSpot next();

    WyViewSpot previous();

    WyViewSpot last();
}
