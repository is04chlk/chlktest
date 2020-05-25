package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/4/22/022.
 */
public class Shopping {
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String lin1;
            lin1=sc.nextLine();
            String[] arr1;
            int n,m;
            arr1=lin1.split(" ");
            n=Integer.parseInt(arr1[0]);//总钱数
            m=Integer.parseInt(arr1[1]);//物品个数
            int[] pri=new int[m];//价格
            int[] imp=new int[m]; //重要度
            int[] zfj=new int[m]; //主附件
            for(int i=0;i<m;i++){
                String ss=sc.nextLine();
                String[] s1=ss.split(" ");
                pri[i]=Integer.parseInt(s1[0]);
                imp[i]=Integer.parseInt(s1[1]);
                zfj[i]=Integer.parseInt(s1[2]);
            }
            int[][] maxval=new int[m][n];  //记录钱数物品的最大值
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    //如果是主件
                    if(zfj[i]==0){
                        if(pri[i]>(j+1) && i>0){
                            maxval[i][j]=maxval[i-1][j];
                        }
                        else if(pri[i]<=(j+1)){
                            if(i==0){
                                maxval[i][j]=pri[i]*imp[i];
                            }
                            else if(i>0){
                                if(maxval[i-1][j]<(maxval[i-1][j+1-pri[i]]+pri[i]*imp[i]))
                                    maxval[i][j]=maxval[i-1][j+1-pri[i]]+pri[i]*imp[i];
                                else if(maxval[i-1][j]>=(maxval[i-1][j+1-pri[i]]+pri[i]*imp[i]))
                                    maxval[i][j]=maxval[i-1][j];
                            }
                        }
                    }
                    else if(zfj[i]>0){
                        if((pri[i]+pri[zfj[i]-1])>(j+1) && i>0){
                            maxval[i][j]=maxval[i-1][j];
                        }
                        else if((pri[i]+pri[zfj[i]-1])<=(j+1)){
                            if(i==0){
                                maxval[i][j]=pri[i]*imp[i];
                            }
                            else if(i>0){
                                if(maxval[i-1][j]>(maxval[i-1][j+1-pri[i]-pri[zfj[i]-1]])+pri[i]*imp[i]+pri[zfj[i]-1]*imp[zfj[i]-1])
                                    maxval[i][j]=maxval[i-1][j];
                                else if(maxval[i-1][j]<=(maxval[i-1][j+1-pri[i]-pri[zfj[i]-1]])+pri[i]*imp[i]+pri[zfj[i]-1]*imp[zfj[i]-1])
                                    maxval[i][j]=maxval[i-1][j+1-pri[i]-pri[zfj[i]-1]]+pri[i]*imp[i]+pri[zfj[i]-1]*imp[zfj[i]-1];
                            }
                        }
                    }
                }
            }
            System.out.println(maxval[m-1][n-1]);
        }
    }
}
