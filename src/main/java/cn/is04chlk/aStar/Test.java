package cn.is04chlk.aStar;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/17/017.
 */
public class Test {
    public static void main(String[] args)
    {
        int[][] maps = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 }
        };
        MapInfo info=new MapInfo(maps,maps[0].length, maps.length,new Node(1, 1), new Node(4, 5));
        new AStar().
                start(info);
        printMap(maps);
    }

    /**
     * 打印地图
     */
    public static void printMap(int[][] maps)
    {
        for (int i = 0; i < maps.length; i++)
        {
            for (int j = 0; j < maps[i].length; j++)
            {
                System.out.print(maps[i][j] + " ");
            }
            System.out.println();
        }
    }
}
