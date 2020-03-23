package intel.impl;

import intel.Colleague;

/**
 * @ClassName ConcreteColleague1
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 08:58
 * @Version V1.0
 **/
public class ConcreteColleague1 extends Colleague{
    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
