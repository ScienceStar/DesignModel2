package intel;

/**
 * @author lxc
 * @title: Element
 * @projectName DesignModel2
 * @description: TODO
 * @date 2020/3/23 17:30
 */
public interface Element {
    void accept(Visitor visitor);
}
