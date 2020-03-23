package mem;

/**
 * @author lxc
 * @title: You
 * @projectName DesignModel2
 * @description: TODO
 * @date 2020/3/23 18:25
 */
public class You {
    private String wifeName;    //妻子

    public void setWife(String name) {
        wifeName = name;
    }

    public String getWife() {
        return wifeName;
    }

    public Girl createMemento() {
        return new Girl(wifeName);
    }

    public void restoreMemento(Girl p) {
        setWife(p.getName());
    }
}
