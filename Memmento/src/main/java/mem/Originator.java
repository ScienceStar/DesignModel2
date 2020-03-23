package mem;

/**
 * @author lxc
 * @title: Originator
 * @projectName DesignModel2
 * @description: TODO
 * @date 2020/3/23 17:48
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void restoreMemento(Memento m) {
        this.setState(m.getState());
    }
}
