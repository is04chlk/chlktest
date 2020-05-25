package cn.is04chlk.leecode;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/21/021.
 */
public class LeetCode1114 {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private static int count = 1;
    public LeetCode1114() {}

    public void first(Runnable printFirst) throws InterruptedException {
        lock.lock();
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        count = 2;
        //其实这里调用signal是有问题
        //假设这里唤醒第三个线程
        //第三个线程会再次调用await,进入等待池等待唤醒
        //第二个线程此时也在等待池中
        //这样就会导致第一个线程和第二个线程都在等待池中
        //condition.signal();
        condition.signalAll();
        lock.unlock();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        lock.lock();
        //为什么这里可以使用if,而下面必须使用while呢
        //如果线程一运行完,线程三拿到了锁,则需要再次判断count值让其进入等待池
        if(count != 2) {
            condition.await();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        count = 3;
        //这里可以调用signal方法,因为只剩下一个线程在等待了
        condition.signal();
        lock.unlock();
    }

    public void third(Runnable printThird) throws InterruptedException {
        lock.lock();
        while(count != 3) {
            condition.await();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        lock.unlock();
    }
    public static void main(String[] args) throws InterruptedException {
        LeetCode1114 lt=new LeetCode1114();
        Runnable one = new Runnable() {
         //   int count=0;
            @Override
            public void run() {
                while (count<10) {
                    System.out.println("one：" + Thread.currentThread().getName() + ",运行次数" + count);
                    count++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable two = new Runnable() {
            @Override
            public void run() {
                while (count<20) {
                    System.out.println("two：" + Thread.currentThread().getName() + ",运行次数" + count);
                    count++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable three = new Runnable() {
            @Override
            public void run() {
                while (count<30) {
                    System.out.println("three：" + Thread.currentThread().getName() + ",运行次数" + count);
                    count++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        lt.first(one);
        lt.second(two);
        lt.third(three);
    }

}
