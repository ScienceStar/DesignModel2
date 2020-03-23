package intel.impl;

import intel.Element;
import intel.Visitor;

/**
 * @author lxc
 * @title: ConcreteElementA
 * @projectName DesignModel2
 * @description: TODO
 * @date 2020/3/23 17:32
 */
public class ConcreteElementA implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA()
    {
        return "具体元素A的操作。";
    }
}
