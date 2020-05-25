package cn.is04chlk.leecode;

import java.util.HashMap;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/22/022.
 */
public class LeetCode128 {
    public int[] twoSum(int[] nums, int target) {
        for(int i=1;i<nums.length;i++){
            for (int j=0;j<i;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int[] num={1,3,5,7};
        int[] resul8;
        LeetCode128 lc=new LeetCode128();
        resul8=lc.twoSum(num,8);
        System.out.println(resul8[0]);
        HashMap hs=new HashMap();
    }
}
