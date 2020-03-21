package chef;

import javax.swing.*;

/**
 * @ClassName ChangFenChef
 * @Description: TODO 肠粉厨师
 * @Author lxc
 * @Date 2020/3/21 17:59
 * @Version V1.0
 **/
public class ChangFenChef extends JFrame{
    private static final long serialVersionUID = 1L;
    JLabel l=new JLabel();
    public ChangFenChef()
    {
        super("煮肠粉");
        l.setText("肠粉出锅了.....");
//        l.setIcon(new ImageIcon("src/command/ChangFen.jpg"));
        this.add(l);
        this.setLocation(30, 30);
        this.pack();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void cooking()
    {
        this.setVisible(true);
    }
}
