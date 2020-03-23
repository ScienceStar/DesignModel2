package intel.impl;

import intel.Element;
import intel.Visitor;

/**
 * @author lxc
 * @title: ConcreteElementB
 * @projectName DesignModel2
 * @description: TODO
 * @date 2020/3/23 17:33
 */
public class ConcreteElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB()
    {
        return "具体元素B的操作。";
    }
}
