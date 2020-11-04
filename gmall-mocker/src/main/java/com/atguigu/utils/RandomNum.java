package com.atguigu.utils;

/**
 * @author frank
 * @create 2020-11-03 18:27
 */
import java.util.Random;

public class RandomNum {
    public static int getRandInt(int fromNum,int toNum){
        return fromNum + new Random().nextInt(toNum-fromNum+1);
    }
}
