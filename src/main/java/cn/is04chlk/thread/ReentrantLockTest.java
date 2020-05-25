package cn.is04chlk.thread;

import java.util.Timer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/21/021.
 */
public class ReentrantLockTest {
    public static final Lock lk=new ReentrantLock();
    public static void main(String[] args){
        new Thread(()->test(),"线程A").start();
        new Thread(()->test(),"线程B").start();
        new Thread(()->chlk(),"chlk").start();
    }
    public static void test(){
        try{
            lk.lock();
            System.out.println(Thread.currentThread().getName()+" 获取了锁！");
            TimeUnit.SECONDS.sleep(2);

        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }finally {
            lk.unlock();
            System.out.println(Thread.currentThread().getName()+"释放了锁");
        }
    }
    public static void chlk(){
        System.out.println(Thread.currentThread().getName()+" 我是程靓坤的线程");
    }
}
