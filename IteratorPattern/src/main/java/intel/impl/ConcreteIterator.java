package intel.impl;

import intel.Iterator;

import java.util.List;

/**
 * @ClassName ConcreteIterator
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 10:43
 * @Version V1.0
 **/
public class ConcreteIterator implements Iterator {
    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public Object first()
    {
        index=0;
        Object obj=list.get(index);;
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if (this.hasNext()) {
            obj = list.get(++index);
        }
        return obj;
    }
}
