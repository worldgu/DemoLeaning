package org.zero.juc.method_01;/**
 * Created by 张春海 on 2020/6/3  13:07
 */

import java.util.concurrent.TimeUnit;

/**
 *@ClassName T01_WhatlsThread
 *@Description TODO
 *@Author 张春海
 *@Date 2020/6/3 13:07 
 *@Version 1.0 */
public class T01_WhatlsThread {

    private static class T1 extends Thread {

        public void run() {
            for (int i =0; i< 10 ; i++) {
                try {
                    TimeUnit.MICROSECONDS.sleep(1);
                } catch (InterruptedException e ) {
                    e.printStackTrace();
                }
                System.out.println("T1");
            }
        }
    }

    public static void main(String[] args){
//        new T1().run();     //  此方法调用 与主线程 顺序执行
        new T1().start();  //  此方法调用会与主线程并行执行

        for (int i = 0; i < 10; i++ ) {
            try {
                //  线程sleep一 毫秒
                TimeUnit.MICROSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("main");
        }
    }
}
