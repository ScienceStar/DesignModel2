package intel;

/**
 * @ClassName Colleague
 * @Description: TODO 抽象同事
 * @Author lxc
 * @Date 2020/3/23 08:50
 * @Version V1.0
 **/
public abstract class Colleague {
    protected Mediator mediator;
    public void setMedium(Mediator mediator)
    {
        this.mediator=mediator;
    }
    public abstract void receive();
    public abstract void send();
}
