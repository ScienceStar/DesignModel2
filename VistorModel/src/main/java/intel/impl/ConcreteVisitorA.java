package intel.impl;

import intel.Visitor;

/**
 * @ClassName ConcreteVisitorA
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 15:28
 * @Version V1.0
 **/
public class ConcreteVisitorA implements Visitor {
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者A访问-->" + element.operationA());
    }

    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者A访问-->" + element.operationB());
    }
}



