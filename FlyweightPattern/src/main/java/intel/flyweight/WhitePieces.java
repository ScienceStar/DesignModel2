package intel.flyweight;

import intel.ChessPieces;

import java.awt.*;

/**
 * @ClassName WhitePieces
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/21 15:13
 * @Version V1.0
 **/
public class WhitePieces implements ChessPieces{
    @Override
    public void DownPieces(Graphics g, Point pt) {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x,pt.y,30,30);
    }
}
