package cn.is04chlk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/4/004.
 */
public class PwdScore {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str=bf.readLine())!=null){
            int scount=0;
            scount=GetPwdSecurityLevel(str);
            if(scount<25)
                System.out.println("VERY_WEAK");
            else if(scount>=25 && scount<50)
                System.out.println("WEAK");
            else if(scount>=50 && scount<60)
                System.out.println("AVERAGE");
            else if(scount>=60 && scount<70)
                System.out.println("STRONG");
            else if(scount>=70 && scount<80)
                System.out.println("VERY_STRONG");
            else if(scount>=80 && scount<90)
                System.out.println("SECURE");
            else if(scount>=90)
                System.out.println("VERY_SECURE");
        }
    }
    public static int GetPwdSecurityLevel(String pPasswordStr)
    {
        int count=0;
        int sco1=0,sco2=0,sco3=0,sco4=0,sco5=0;
        if(pPasswordStr.length()<=4)
            sco1=5;
        else if(pPasswordStr.length()>=5 && pPasswordStr.length()<=7)
            sco1=10;
        else if(pPasswordStr.length()>7)
            sco1=25;
        int[] style=new int[4]; //大写字母个数，小写字母个数，数字个数，其他字符个数
        int[] zimu=new int[2];
        int dig=0;
        for(int i=0;i<pPasswordStr.length();i++){
            if(pPasswordStr.charAt(i)>='a' && pPasswordStr.charAt(i)<='z'){
                zimu[1]=1;
                style[1]+=1;
            }
            else if(pPasswordStr.charAt(i)>='A' && pPasswordStr.charAt(i)<='Z'){
                zimu[0]=1;
                style[0]+=1;
            }
            else if(pPasswordStr.charAt(i)>='0' && pPasswordStr.charAt(i)<='9'){
                style[2]+=1;
            }
            else {
                style[3]+=1;
            }
        }
        if(zimu[0]+zimu[1]==1)
            sco2=10;
        else if(zimu[0]+zimu[1]==2)
            sco2=20;
        else
            sco2=0;

        if(style[2]==1)
            sco3=10;
        else if(style[2]>1)
            sco3=20;
        else
            sco3=0;

        if(style[3]==1)
            sco4=10;
        else if(style[3]>1)
            sco4=25;
        else
            sco4=0;

        if(style[2]>0 && (zimu[0]+zimu[1]==1) && style[3]==0)
            sco5=2;
        else if(style[2]>0 && (zimu[0]+zimu[1]==1) && style[3]>0)
            sco5=3;
        else if(style[2]>0 && (zimu[0]+zimu[1]==2) && style[3]>0)
            sco5=5;

        count=sco1+sco2+sco3+sco4+sco5;
        return count;
    }
}
