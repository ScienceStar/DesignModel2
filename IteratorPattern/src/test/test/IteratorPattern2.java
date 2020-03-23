package test;

import intel.Aggregate;
import intel.Iterator;
import intel.impl.ConcreteAggregate;

/**
 * @ClassName IteratorPattern2
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 10:51
 * @Version V1.0
 **/
public class IteratorPattern2 {
    public static void main(String[] args) {
        Aggregate ag=new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华南理工");
        ag.add("韶关学院");
        System.out.print("聚合的内容有：");
        Iterator it=ag.getIterator();
        while(it.hasNext())
        {
            Object ob=it.next();
            System.out.print(ob.toString()+"\t");
        }
        Object ob=it.first();
        System.out.println("\nFirst："+ob.toString());
    }
}
