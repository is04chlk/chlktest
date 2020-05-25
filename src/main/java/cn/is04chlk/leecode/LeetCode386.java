package cn.is04chlk.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/25/025.
 */
public class LeetCode386 {
    public static List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<Integer>();
        int cur=1;
     //   list.add(cur);
        for(int i=0;i<n;i++){
            if(n>=cur)
                list.add(cur);
            if(cur*10<=n){
                cur=cur*10;
            }
            else {
                if(n<=cur){
                    cur=cur/10;
                }
                cur=cur+1;
                while (cur%10==0){
                    cur=cur/10;
                }
            }
        }
        return list;
    }
    public static void main(String[] args){
        List<Integer> st=lexicalOrder(23);
        System.out.println("排序完成");
    }
}
