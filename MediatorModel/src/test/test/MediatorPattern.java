package test;

import intel.Colleague;
import intel.Mediator;
import intel.impl.ConcreteColleague1;
import intel.impl.ConcreteColleague2;
import intel.impl.ConcreteMediator;

/**
 * @ClassName MediatorPattern
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 09:01
 * @Version V1.0
 **/
public class MediatorPattern {
    public static void main(String[] args) {
        Mediator md=new ConcreteMediator();
        Colleague c1,c2;
        c1=new ConcreteColleague1();
        c2=new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}
