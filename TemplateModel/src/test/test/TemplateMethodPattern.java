import abst.AbstractClass;
import automatic.ConcreteClass;

/**
 * @ClassName TemplateMethodPattern
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/22 18:09
 * @Version V1.0
 **/
public class TemplateMethodPattern {
    public static void main(String[] args) {
        AbstractClass tm=new ConcreteClass();
        tm.TemplateMethod();
    }
}
