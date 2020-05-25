package cn.is04chlk.leecode;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/25/025.
 */
public class LeetCode45 {
    public String minNumber(int[] nums) {
        String res="";
        PriorityQueue<Integer> qe= new PriorityQueue<Integer>((o1,o2)->o1.compareTo(o2));
        for(int i=0;i<nums.length;i++){
            qe.add(nums[i]);
        }
        int mid=0;String start="";
        while (qe.size()>0){
            res=res+qe.poll();
        }
        /*int mid=0;String start="";
        for(int i=0;i<res.length();i++){
            if(!"0".equals(res.substring(i,i+1))){
                mid=i;
                start=res.substring(i,i+1);
                break;
            }
        }
        if(mid>0)
            res=start+res.substring(0,mid)+res.substring(mid+1);*/
        return res;
    }
    public static void main(String[] args){
        LeetCode45 lt=new LeetCode45();
        String res=lt.minNumber(new int[]{13,23,5,123,201,53});
   //     String res=lt.minNumber(new int[]{10,2});
        System.out.println(res);
    }
}
