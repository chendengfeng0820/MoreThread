package com.moreThread.Thread3;

/**
 * @author: cdf
 * @create: 2020-03-12 16:52
 **/
public class Ten {

    public static void main(String[] args) {
        ten();
    }

    public static void ten() {
        int a=10;
        try {
        while (true){
            System.out.println(a--);
                Thread.sleep(1000);
                if (a==0){
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

