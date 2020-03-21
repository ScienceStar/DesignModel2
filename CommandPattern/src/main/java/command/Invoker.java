package command;

import intel.Command;

/**
 * @ClassName Invoker
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/21 16:29
 * @Version V1.0
 **/
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}
