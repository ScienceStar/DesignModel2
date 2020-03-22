package test;

import hand.ConcreteHandler1;
import hand.ConcreteHandler2;
import hand.intel.Handler;

/**
 * @ClassName ChainOfResponsibilityPattern
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/22 18:56
 * @Version V1.0
 **/
public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1=new ConcreteHandler1();
        Handler handler2=new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}
