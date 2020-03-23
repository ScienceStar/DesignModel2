package intel.impl;

/**
 * @ClassName WyViewSpot
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 11:27
 * @Version V1.0
 **/
public class WyViewSpot {
    private String Name;
    private String Introduce;

    WyViewSpot(String Name, String Introduce) {
        this.Name = Name;
        this.Introduce = Introduce;
    }

    public String getName() {
        return Name;
    }

    public String getIntroduce() {
        return Introduce;
    }
}
