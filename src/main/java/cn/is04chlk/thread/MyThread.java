package cn.is04chlk.thread;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/21/021.
 */
public class MyThread implements Runnable {

    int count=0;
    String name=null;
    MyThread(String name)
    {
        this.name=name;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            count++;
            System.out.println(name+":输出结果..."+count);
        }
    }

}
