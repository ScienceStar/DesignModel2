package chef;

import javax.swing.*;

/**
 * @ClassName HunTunChef
 * @Description: TODO 馄炖厨师
 * @Author lxc
 * @Date 2020/3/21 18:02
 * @Version V1.0
 **/
public class HunTunChef extends JFrame{
    private static final long serialVersionUID=1L;
    JLabel l=new JLabel();
    public HunTunChef()
    {
        super("煮馄饨");
        l.setText("混沌出锅了.......");
        l.setIcon(new ImageIcon("src/command/HunTun.jpg"));
        this.add(l);
        this.setLocation(350, 50);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking()
    {
        this.setVisible(true);
    }
}
