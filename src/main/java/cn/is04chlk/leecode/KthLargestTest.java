package cn.is04chlk.leecode;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/22/022.
 */
public class KthLargestTest {
    public static void add() {
        int k = 3;
        int[] arr = new int[] { 4, 5, 8, 2 };
        KthLargest kthLargest = new KthLargest(k, arr);
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }
    public static void main(String[] args){
        add();
    }
}
