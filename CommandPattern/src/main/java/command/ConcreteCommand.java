package command;

import intel.Command;

/**
 * @ClassName ConcreteCommand
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/21 16:33
 * @Version V1.0
 **/
public class ConcreteCommand implements Command{
    private Receiver receiver;

    public ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
