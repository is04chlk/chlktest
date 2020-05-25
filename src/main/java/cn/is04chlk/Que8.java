package cn.is04chlk;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/9/009.
 */
public class Que8 {
    int max=8;
    int[] ary=new int[max];
    static int count=0;
    public static void main(String[] args){
        Que8 q=new Que8();
        q.find(0);
        System.out.println("一共有"+count+"个结果");
    }
    public void find(int n){
        if(n==max){
            printf();
            return;
        }

        for(int i=0;i<max;i++){
            ary[n]=i;
            if(check(n)){
                find(n+1);
            }
        }
    }
    public boolean check(int k){
        for(int i=0;i<k;i++){
            if(ary[i]==ary[k] || Math.abs(k-i)==Math.abs(ary[k]-ary[i]))
                return false;
        }
        return true;
    }

    public  void printf(){
        count++;
        for (int i=0;i<max-1;i++)
            System.out.print(ary[i]+" ");
        System.out.print(ary[max-1]);
        System.out.println();
    }
}
