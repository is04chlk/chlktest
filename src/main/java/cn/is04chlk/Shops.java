package cn.is04chlk;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Shops {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(str.split(" ")[0])/10;
        int m = Integer.parseInt(str.split(" ")[1]);
        int[] v= new int[m+1];
        int[] p= new int[m+1];
        int[] q= new int[m+1];
        boolean[] flags = new boolean[m+1];
        int[][] res = new int[m+1][N+1];
        for (int i = 1; i <= m; i++) {
            String[] strings = br.readLine().split(" ");
            v[i] = (Integer.parseInt(strings[0]))/10;
            p[i] = Integer.parseInt(strings[1]) * v[i];
            q[i] = Integer.parseInt(strings[2]);
        }

        for (int i = 1; i <= m; i++) {
            for(int j = 1; j<=N; j++){
                if(q[i] == 0) {
                    if(v[i] <= j){
                        res[i][j] = Math.max(res[i-1][j], res[i-1][j-v[i]] + p[i]);
                    }
                    else if(v[i] > j)
                        res[i][j] =res[i-1][j];
                }else{
                    if(v[i] + v[q[i]] <= j){
                        res[i][j] = Math.max(res[i-1][j], res[i-1][j-v[i]] + p[i]);
                    }
                    else if(v[i] + v[q[i]] > j)
                        res[i][j] =res[i-1][j];
                }
            }
        }
        System.out.println(res[m][N] * 10);
    }
}