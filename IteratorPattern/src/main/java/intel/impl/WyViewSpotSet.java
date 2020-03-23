package intel.impl;

import intel.ViewSpotIterator;
import intel.ViewSpotSet;

import java.util.ArrayList;

/**
 * @ClassName WyViewSpotSet
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 11:29
 * @Version V1.0
 **/
public class WyViewSpotSet implements ViewSpotSet {
    private ArrayList<WyViewSpot> list=new ArrayList<WyViewSpot>();

    @Override
    public void add(WyViewSpot obj) {
        list.add(obj);
    }
    /**
     * @description: TODO 删除对象
     * @param obj
     * @return void
     * @throws
     * @author lxc
     * @date 2020/3/23 16:50
     */
    @Override
    public void remove(WyViewSpot obj) {
        list.remove(obj);
    }

    @Override
    public ViewSpotIterator getIterator() {
        return (new WyViewSpotIterator(list));
    }
}
