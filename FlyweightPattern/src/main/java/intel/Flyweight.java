package intel;

import intel.flyweight.UnsharedConcreteFlyweight;

/**
 * @ClassName Flyweight
 * @Description: TODO 抽象享元角色
 * @Author lxc
 * @Date 2020/3/21 13:51
 * @Version V1.0
 **/
public interface Flyweight {
    public void operation(UnsharedConcreteFlyweight state);
}
