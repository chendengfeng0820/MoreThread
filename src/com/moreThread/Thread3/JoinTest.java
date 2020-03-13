package com.moreThread.Thread3;

/**
 * @author: cdf
 * @create: 2020-03-12 17:16
 **/
public class JoinTest implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("VIP线程"+i);
        }
    }

    public static void main(String[] args) {

        JoinTest joinTest=new JoinTest();
        Thread thread = new Thread(joinTest);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程"+i);
            if(i==50){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
