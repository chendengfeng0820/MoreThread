package com.moreThread.Thread3;

import com.sun.org.apache.xml.internal.resolver.readers.ExtendedXMLCatalogReader;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: cdf
 * @create: 2020-03-12 17:01
 **/
public class Time {
    public static void main(String[] args) {

        //获取系统当前时间
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
                date = new Date(System.currentTimeMillis());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
