package hand;

import hand.intel.Handler;

/**
 * @ClassName ConcreteHandler1
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/22 18:53
 * @Version V1.0
 **/
public class ConcreteHandler1 extends Handler {
    
    /**
     * @description: TODO
     * @param [request]
     * @return void 
     * @throws 
     * @author lxc
     * @date 2020/3/23 17:38
     */
    @Override
    public void handleRequest(String request) {
        if (request.equals("one")) {
            System.out.println("具体处理者1负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
