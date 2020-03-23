import intel.Visitor;
import intel.impl.*;

/**
 * @author lxc
 * @title: VisitorPattern
 * @projectName DesignModel2
 * @description: TODO
 * @date 2020/3/23 17:38
 */
public class VisitorPattern {
    public static void main(String[] args) {
        ObjectStructure os=new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor=new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor=new ConcreteVisitorB();
        os.accept(visitor);
    }
}
