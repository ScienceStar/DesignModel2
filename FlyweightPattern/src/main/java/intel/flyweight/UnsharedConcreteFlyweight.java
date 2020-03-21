package intel.flyweight;

/**
 * @ClassName intel.flyweight.UnsharedConcreteFlyweight
 * @Description: TODO 非享元角色
 * @Author lxc
 * @Date 2020/3/21 13:52
 * @Version V1.0
 **/
public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
