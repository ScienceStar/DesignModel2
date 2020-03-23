package intel.impl;

import intel.Colleague;
import intel.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ConcreteMediator
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 08:52
 * @Version V1.0
 **/
public class ConcreteMediator extends Mediator {

    private List<Colleague> colleagues = new ArrayList<Colleague>();

    @Override
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }

    @Override
    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) {
                ((Colleague) ob).receive();
            }
        }
    }
}
