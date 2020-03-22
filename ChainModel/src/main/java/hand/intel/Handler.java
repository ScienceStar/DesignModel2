package hand.intel;

/**
 * @ClassName Handler
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/22 18:51
 * @Version V1.0
 **/
public abstract class Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    //处理请求的方法
    public abstract void handleRequest(String request);
}
