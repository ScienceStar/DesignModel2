package intel.factory;

import intel.ChessPieces;
import intel.flyweight.BlackPieces;
import intel.flyweight.WhitePieces;

import java.util.ArrayList;

/**
 * @ClassName WeiqiFactory
 * @Description: TODO
 * @Author lxc
 * @Date 2020/3/21 15:14
 * @Version V1.0
 **/
public class WeiqiFactory {
    private ArrayList<ChessPieces> qz;
    public WeiqiFactory()
    {
        qz=new ArrayList<ChessPieces>();
        ChessPieces w=new WhitePieces();
        qz.add(w);
        ChessPieces b=new BlackPieces();
        qz.add(b);
    }
    public ChessPieces getChessPieces(String type)
    {
        if(type.equalsIgnoreCase("w"))
        {
            return (ChessPieces)qz.get(0);
        }
        else if(type.equalsIgnoreCase("b"))
        {
            return (ChessPieces)qz.get(1);
        }
        else
        {
            return null;
        }
    }
}
