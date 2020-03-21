package command;

import chef.ChangFenChef;
import intel.Breakfast;

/**
 * @ClassName ChangFen
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/21 18:06
 * @Version V1.0
 **/
public class ChangFen implements Breakfast {
    private ChangFenChef receiver;

    public ChangFen() {
        receiver = new ChangFenChef();
    }

    @Override
    public void cooking() {
        receiver.cooking();
    }
}
