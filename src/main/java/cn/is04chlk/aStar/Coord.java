package cn.is04chlk.aStar;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/13/013.
 */
public class Coord {
    public int x;
    public int y;

    public Coord(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) return false;
        if (obj instanceof Coord)
        {
            Coord c = (Coord) obj;
            return x == c.x && y == c.y;
        }
        return false;
    }
}
