package intel.flyweight;

import intel.ChessPieces;

import java.awt.*;

/**
 * @ClassName BlackPieces
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/21 15:15
 * @Version V1.0
 **/
public class BlackPieces implements ChessPieces{
    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x,pt.y,30,30);
    }
}
