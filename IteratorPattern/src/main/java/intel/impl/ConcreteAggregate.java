package intel.impl;

import intel.Aggregate;
import intel.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreteAggregate
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 10:40
 * @Version V1.0
 **/
public class ConcreteAggregate implements Aggregate{

    private List<Object> list=new ArrayList<Object>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator getIterator() {
        return (new ConcreteIterator(list));
    }
}
