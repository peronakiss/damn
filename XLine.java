

package damn;

public class XLine
{

    public static int[] getLineIntersect(int ax1, int ay1, int ax2, int ay2,  int bx1, int by1, int bx2, int by2)
    {   int point[] =new int[]{0,0}
        float slopea=(ay1+ay2)/(ax1+ax2);
        float slopeb=(by1+by2)/(bx1+bx2);
        y=mx+b
        float aconst=ay1-slopea*ax1;
        float bconst=by1-slopeb*bx1;
        float x = (bconst - aconst) / (slopeb - slopea);
        float y = slopea * x + aconst;
        point[0]=(int)x;
        point[1]=(int)y;
        return point;
    }

}
