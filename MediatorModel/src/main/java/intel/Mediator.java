package intel;

/**
 * @ClassName Mediator
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 08:48
 * @Version V1.0
 **/
public abstract class Mediator {
    public abstract void register(Colleague colleague);
    public abstract void relay(Colleague cl); //转发
}
