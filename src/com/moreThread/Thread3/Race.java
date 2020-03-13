package com.moreThread.Thread3;

import java.util.Random;

/**
 * @author: cdf
 * @create: 2020-03-12 15:11
 **/
public class Race implements Runnable {

    private static String winner;
    @Override
    public void run() {
        for (int i = 0; i <=100; i++) {
            boolean flag=ganmeover(i);
            if(flag){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");
        }
    }

    public static void main(String[] args) {
        Race r=new Race();
        new Thread(r,"兔子").start();
        new Thread(r,"乌龟").start();
    }

    public boolean ganmeover(int number){
        if(winner!=null){
            return true;
        }
        if(number==100){
            winner=Thread.currentThread().getName();
            System.out.println("winner是"+winner);
            return true;
        }
        return false;
    }
}
