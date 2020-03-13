package com.moreThread.Thread1;

import com.moreThread.Thread.ThreadTest;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author: cdf
 * @create: 2020-03-12 14:20
 **/
public class ThreadTest1 extends Thread{

    private String url;
    private String name;


    public ThreadTest1(String url,String name){
        this.url=url;
        this.name=name;
    }

    @Override
    public void run() {
        Downloader downloader=new Downloader();
        downloader.downLoader(url,name);
        System.out.println("下载好了"+name+"号文件");
    }

    public static void main(String[] args) {
        ThreadTest1 t1=new ThreadTest1("http://dp.xinshoucun.com/uploads/article/2012-05/6_1337784899.jpg","1");
        ThreadTest1 t2=new ThreadTest1("http://pic1.win4000.com/wallpaper/3/56f22aacd3d2a.jpg","2");
        ThreadTest1 t3=new ThreadTest1("http://pic2.52pk.com/files/180209/7837976_141452_1_lit.jpg","3");


        t1.start();
        t2.start();
        t3.start();

    }

}

class Downloader{
    public void downLoader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        }
