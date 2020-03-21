package test;

import command.ConcreteCommand;
import command.Invoker;
import intel.Command;

/**
 * @ClassName CommandPattern
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/21 16:34
 * @Version V1.0
 **/
public class CommandPattern {
    public static void main(String[] args) {
        Command cmd=new ConcreteCommand();
        Invoker ir=new Invoker(cmd);
        System.out.println("客户访问调用者的call()方法...");
        ir.call();
    }
}
