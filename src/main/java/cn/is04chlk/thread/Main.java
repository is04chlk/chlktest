package cn.is04chlk.thread;

import cn.is04chlk.huawei.Line;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/21/021.
 */
public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyThread mya=new MyThread("线程A");
        Thread testA=new Thread(mya);
        testA.start();
        new Thread(()-> {
            try {
                threadTest();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"测试线程").start();
        MyThread myb=new MyThread("线程B");
        Thread testB=new Thread(myb);
        testB.start();
    }
    public static void threadTest() throws InterruptedException {
        int count=0;
        System.out.println(Thread.currentThread().getName()+" 线程正在执行"+count);
        count++;
        Thread.sleep(10);
    }
}
