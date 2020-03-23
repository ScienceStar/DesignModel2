package intel.impl;

import intel.Medium;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ClassName Customer
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/23 09:41
 * @Version V1.0
 **/
public abstract class Customer extends JFrame implements ActionListener{
    private static final long serialVersionUID=-7219939540794786080L;
    protected Medium medium;
    protected String name;
    JTextField SentText;
    JTextArea ReceiveArea;

    public Customer(String name)
    {
        super(name);
        this.name=name;
    }
    void ClientWindow(int x,int y)
    {
        Container cp;
        JScrollPane sp;
        JPanel p1,p2;
        cp=this.getContentPane();
        SentText=new JTextField(18);
        ReceiveArea=new JTextArea(10,18);
        ReceiveArea.setEditable(false);
        p1=new JPanel();
        p1.setBorder(BorderFactory.createTitledBorder("接收内容："));
        p1.add(ReceiveArea);
        sp=new JScrollPane(p1);
        cp.add(sp,BorderLayout.NORTH);
        p2=new JPanel();
        p2.setBorder(BorderFactory.createTitledBorder("发送内容："));
        p2.add(SentText);
        cp.add(p2,BorderLayout.SOUTH);
        SentText.addActionListener(this);
        this.setLocation(x,y);
        this.setSize(250, 330);
        this.setResizable(false); //窗口大小不可调整
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String tempInfo=SentText.getText().trim();
        SentText.setText("");
        this.send(tempInfo);
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public abstract void send(String ad);
    public abstract void receive(String from,String ad);

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public JTextField getSentText() {
        return SentText;
    }

    public void setSentText(JTextField sentText) {
        SentText = sentText;
    }

    public JTextArea getReceiveArea() {
        return ReceiveArea;
    }

    public void setReceiveArea(JTextArea receiveArea) {
        ReceiveArea = receiveArea;
    }
}
