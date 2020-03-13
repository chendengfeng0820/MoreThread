package com.moreThread.Thread2;

/**
 * @author: cdf
 * @create: 2020-03-12 14:05
 **/
public class ThreadTest2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("陈登峰在学习:"+i);
        }
    }

    public static void main(String[] args) {
        ThreadTest2 threadTest2 = new ThreadTest2();
        new Thread(threadTest2).start();


        for (int i = 0; i < 20; i++) {
            System.out.println("付艳玲在学习："+i);
        }
    }
}
