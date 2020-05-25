package cn.is04chlk.leecode;

import java.util.HashMap;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/21/021.
 */
public class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int maxLen=0;
        for(int n:nums){



            if(mp.get(n)==null) {
                int lf = (mp.get(n - 1) == null ? 0 : mp.get(n - 1));
                int rg = (mp.get(n + 1) == null ? 0 : mp.get(n + 1));
                int len = 1 + lf + rg;
                if (maxLen < len)
                    maxLen = len;
                mp.put(n - lf, len);
                mp.put(n, len);
                mp.put(n + rg, len);
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[] nums={1,2,0,1};
        Solution s=new Solution();
        System.out.println(s.longestConsecutive(nums));
    }
}
