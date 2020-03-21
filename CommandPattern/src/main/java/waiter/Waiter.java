package waiter;

import intel.Breakfast;

/**
 * @ClassName Waiter
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/21 18:10
 * @Version V1.0
 **/
public class Waiter {

    private Breakfast changFen,hunTun,heFen;
    public void setChangFen(Breakfast f)
    {
        changFen=f;
    }
    public void setHunTun(Breakfast f)
    {
        hunTun=f;
    }
    public void setHeFen(Breakfast f)
    {
        heFen=f;
    }
    public void chooseChangFen()
    {
        changFen.cooking();
    }
    public void chooseHunTun()
    {
        hunTun.cooking();
    }
    public void chooseHeFen()
    {
        heFen.cooking();
    }
}
