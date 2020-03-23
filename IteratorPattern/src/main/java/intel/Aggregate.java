package intel;

/**
 * @ClassName Aggregate
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 10:24
 * @Version V1.0
 **/
public interface Aggregate {
    public void add(Object obj);
    public void remove(Object obj);
    public Iterator getIterator();
}
