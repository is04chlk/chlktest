package cn.is04chlk;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/4/23/023.
 */
public class Zuobiao {
    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String[] strs=str.split(";");
            int lat=0,lnt=0;
            for(int i=0;i<strs.length;i++){
                if(strs[i].length()<2)
                    continue;
                char a=strs[i].charAt(0);
                String nums=strs[i].substring(1);
                if(a=='A'){
                    boolean isnum=false;
                    if(isInteger(nums) && nums.length()<3){
                           int nn=Integer.parseInt(nums);
                           lat=lat-nn;
                    }
                }
                else if(a=='S'){
                    boolean isnum=false;
                    if(isInteger(nums) && nums.length()<3){
                        int nn=Integer.parseInt(nums);
                        lnt=lnt-nn;
                    }
                }
                else if(a=='W'){
                    boolean isnum=false;
                    if(isInteger(nums) && nums.length()<3){
                        int nn=Integer.parseInt(nums);
                        lnt=lnt+nn;
                    }
                }
                else if(a=='D'){
                    boolean isnum=false;
                    if(isInteger(nums) && nums.length()<3){
                        int nn=Integer.parseInt(nums);
                        lat=lat+nn;
                    }
                }
            }
            System.out.println(lat+","+lnt);
        }
    }
}
