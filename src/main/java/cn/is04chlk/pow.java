package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/4/23/023.
 */
public class pow {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String lin1;
            lin1 = sc.nextLine();
            String[] arr1;
            int n, m;
            arr1 = lin1.split(" ");
            n = Integer.parseInt(arr1[0]);//总钱数
            m = Integer.parseInt(arr1[1]);//物品个数
            /*int[] pri = new int[m+1];//价格
            int[] imp = new int[m+1]; //重要度
            int[] zfj = new int[m+1]; //主附件
            for (int i = 1; i < m+1; i++) {
                String ss = sc.nextLine();
                String[] s1 = ss.split(" ");
                pri[i] = Integer.parseInt(s1[0]);
                imp[i] = Integer.parseInt(s1[1])*pri[i];
                zfj[i] = Integer.parseInt(s1[2]);
            }
            int[][] maxval = new int[m+1][n+1];  //记录钱数物品的最大值*/
            for(int i=0;i<Math.pow(2,m);i++){
                String binary=Integer.toBinaryString(i);
                int len=binary.length();
                if(len<m){
                    for(int t=0;t<m-len;t++)
                        binary="0"+binary;
                }
                System.out.println(binary);
            }
        }

    }
}
