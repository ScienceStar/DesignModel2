package intel.impl;

import intel.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName EstateMedium
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 09:41
 * @Version V1.0
 **/
public class EstateMedium implements Medium {
    private List<Customer> members = new ArrayList<Customer>();

    @Override
    public void register(Customer member) {
        if (!members.contains(member)) {
            members.add(member);
            member.setMedium(this);
        }
    }

    @Override
    public void relay(String from, String ad) {
        for (Customer ob : members) {
            String name = ob.getName();
            if (!name.equals(from)) {
                ((Customer) ob).receive(from, ad);
            }
        }
    }
}
