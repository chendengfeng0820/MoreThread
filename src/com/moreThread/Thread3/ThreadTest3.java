package com.moreThread.Thread3;

/**
 * @author: cdf
 * @create: 2020-03-12 14:52
 **/
public class ThreadTest3 implements Runnable {

    private static int ticketnumber=10;
    @Override
    public void run() {
        while (true){
            if (ticketnumber<0){
                break;
            }try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketnumber--+"票");
        }
    }

    public static void main(String[] args) {
        ThreadTest3 t1=new ThreadTest3();

        new Thread(t1,"小米").start();
        new Thread(t1,"华为").start();
        new Thread(t1,"VIVO").start();
    }
}
