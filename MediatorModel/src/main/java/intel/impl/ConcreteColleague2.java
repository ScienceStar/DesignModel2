package intel.impl;

import intel.Colleague;

/**
 * @ClassName ConcreteColleague2
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 09:00
 * @Version V1.0
 **/
public class ConcreteColleague2 extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求。");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求。");
        mediator.relay(this); //请中介者转发
    }
}
