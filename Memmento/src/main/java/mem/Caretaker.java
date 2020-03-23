package mem;

/**
 * @author lxc
 * @title: Caretaker
 * @projectName DesignModel2
 * @description: TODO
 * @date 2020/3/23 17:49
 */
public class Caretaker {
    private Memento memento;
    public void setMemento(Memento m)
    {
        memento=m;
    }
    public Memento getMemento()
    {
        return memento;
    }
}
