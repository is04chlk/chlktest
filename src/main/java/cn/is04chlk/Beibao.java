package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/4/21/021.
 */
public class Beibao {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            String ms,ns;
            int m, n, a;
            ms = sc.nextLine();
            ns = sc.nextLine();
            m=Integer.parseInt(ms);
            n=Integer.parseInt(ns);
            int[][] arr = new int[n][m];
            for (int t = 0; t < m; t++)
                arr[0][t] = 0;
            int[] pri = new int[n + 1];
            int[] val = new int[n + 1];
            for (int i = 0; i < n; i++) {
                String str;
                str=sc.nextLine();
                String[] aa=str.split(" ");
                pri[i] = Integer.parseInt(aa[0]);
                val[i] = Integer.parseInt(aa[1]);
            }
            for (int j = 0; j <n; j++) {
                for (int k = 0; k <m; k++) {
                        if (pri[j] > k && j>0 ){
                            arr[j][k] = arr[j - 1][k];
                        }
                        else if (pri[j] <= k){
                            if(j==0)
                                arr[j][k] =pri[j]*val[j];
                            else if(j>0){
                                int max=arr[j - 1][k];
                                int tmp=arr[j - 1][k - pri[j]] + pri[j]*val[j];
                                if(max<tmp)
                                    max=tmp;
                                arr[j][k]=max;
                            }

                        }
                }
            }
            System.out.println(arr[n-1][m-1]);
        }
    }
}
