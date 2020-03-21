package intel.flyweight;

import intel.Flyweight;

/**
 * @ClassName ConcreteFlyweight
 * @Description: TODO 具体享元角色
 * @Author lxc
 * @Date 2020/3/21 13:55
 * @Version V1.0
 **/
public class ConcreteFlyweight implements Flyweight{

    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.println("具体享元"+key+"被调用！");
        System.out.println("非享元信息是:"+state.getInfo());
    }
}
