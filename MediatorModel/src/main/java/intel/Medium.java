package intel;

import intel.impl.Customer;

/**
 * @ClassName Medium
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 09:40
 * @Version V1.0
 **/
public interface Medium {
    void register(Customer member); //客户注册

    void relay(String from, String ad); //转发
}
