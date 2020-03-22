package automatic;

import abst.AbstractClass;

/**
 * @ClassName ConcreteClass
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/22 18:03
 * @Version V1.0
 **/
public class ConcreteClass extends AbstractClass{
    @Override
    public void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用。。。。。。");
    }

    @Override
    public void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用。。。。。。");
    }
}
