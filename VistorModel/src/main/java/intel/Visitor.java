package intel;

import intel.impl.ConcreteElementA;
import intel.impl.ConcreteElementB;

/**
 * @ClassName Visitor
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 15:28
 * @Version V1.0
 **/
public interface Visitor {
    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
