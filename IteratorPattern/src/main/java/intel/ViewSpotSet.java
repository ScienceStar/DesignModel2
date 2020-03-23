package intel;

import intel.impl.WyViewSpot;

/**
 * @ClassName ViewSpotSet
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 11:28
 * @Version V1.0
 **/
public interface ViewSpotSet {
    void add(WyViewSpot obj);

    void remove(WyViewSpot obj);

    ViewSpotIterator getIterator();
}
