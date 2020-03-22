package hand;

import hand.intel.Handler;

/**
 * @ClassName ConcreteHandler2
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/22 18:55
 * @Version V1.0
 **/
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("two")) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
