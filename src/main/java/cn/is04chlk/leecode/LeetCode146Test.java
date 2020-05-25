package cn.is04chlk.leecode;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/25/025.
 */
public class LeetCode146Test {
    public static void main(String[] args){
        LeetCode146 cache=new LeetCode146(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        System.out.println(cache.get(2));       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        System.out.println(cache.get(1));       // 返回 -1 (未找到)
        System.out.println(cache.get(3));       // 返回  3
        System.out.println(cache.get(4));       // 返回  4
    }
}
