package command;

import chef.HunTunChef;
import intel.Breakfast;

/**
 * @ClassName HunTun
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/21 18:07
 * @Version V1.0
 **/
public class HunTun implements Breakfast{

    private HunTunChef receiver;
    public HunTun()
    {
        receiver=new HunTunChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
