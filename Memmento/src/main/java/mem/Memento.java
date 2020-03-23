package mem;

/**
 * @author lxc
 * @title: Memento
 * @projectName DesignModel2
 * @description: TODO
 * @date 2020/3/23 17:48
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
