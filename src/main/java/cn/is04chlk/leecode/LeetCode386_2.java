package cn.is04chlk.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/25/025.
 */
public class LeetCode386_2 {
    List<Integer> anslexicalOrder = new ArrayList<>();
    public List<Integer> lexicalOrder(int n) {
        lexicalOrderDFS(n, 0, 0);
        return anslexicalOrder;
    }

    public void lexicalOrderDFS(int maxValue, int num, int start) {
        if (num > maxValue)
            return;

        if(num > 0)
            anslexicalOrder.add(num);

        for (int i = start > 0 ? 0 : 1; i <= 9; i++)
            lexicalOrderDFS(maxValue, num * 10 + i, start + 1);
    }
    public static void main(String[] args){
        LeetCode386_2 lt=new LeetCode386_2();
        List<Integer> st=lt.lexicalOrder(23);
        System.out.println("排序完成");
        String aa=String.valueOf(12);
        System.out.println(aa);
    }
}
