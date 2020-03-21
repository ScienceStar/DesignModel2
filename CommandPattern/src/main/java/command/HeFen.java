package command;

import chef.HeFenChef;
import intel.Breakfast;

/**
 * @ClassName HeFen
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/21 18:08
 * @Version V1.0
 **/
public class HeFen implements Breakfast{

    private HeFenChef receiver;
    public HeFen()
    {
        receiver=new HeFenChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
