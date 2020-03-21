package chef;

import javax.swing.*;

/**
 * @ClassName HeFenChef
 * @Description: TODO 河粉厨师
 * @Author lxc
 * @Date 2020/3/21 18:04
 * @Version V1.0
 **/
public class HeFenChef extends JFrame{
    private static final long serialVersionUID=1L;
    JLabel l=new JLabel();
    public HeFenChef()
    {
        super("煮河粉");
        l.setIcon(new ImageIcon("src/command/HeFen.jpg"));
        l.setText("河粉出锅了.......");
        this.add(l);
        this.setLocation(200, 280);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking()
    {
        this.setVisible(true);
    }
}
