package test;

import intel.Medium;
import intel.impl.Buyer;
import intel.impl.Customer;
import intel.impl.EstateMedium;
import intel.impl.Seller;

/**
 * @ClassName DatingPlatform
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 09:59
 * @Version V1.0
 **/
public class DatingPlatform {
    public static void main(String[] args) {
        Medium md = new EstateMedium();    //房产中介
        Customer member1, member2;
        member1 = new Seller("张三(卖方)");
        member2 = new Buyer("李四(买方)");
        md.register(member1); //客户注册
        md.register(member2);
    }
}
