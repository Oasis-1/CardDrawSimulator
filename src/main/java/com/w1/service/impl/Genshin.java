package com.w1.service.impl;

import com.w1.service.CommonService;

import java.util.Arrays;

/**
 * 原神
 * 73抽前0.6
 * 然后每次加6
 * （（n-73）*6）+0.6
 * @author mingyifan
 * @date 2022-07-29 17:04
 */
public class Genshin extends CommonService {

    public Genshin(Integer guaranteed, Long startGuaranteed, double guaranteedAdd, double orange, Integer percentage) {
        super(guaranteed, startGuaranteed, guaranteedAdd, orange, percentage);
    }

    @Override
    public void tenFire(long sum) {
        int[] ints=new int[100];
        int count=0;
        for (int i = 0; i <sum ; i++) {
            if (singleFire()){
                //中了，保底归零
                ints[guaranteed%100]++;
                count++;
                guaranteed=1;
            }else {
                //没中保底+1
                guaranteed++;
            }
        }
        System.out.println("抽 ："+sum);
        System.out.println("出 ："+count);
        System.out.println("出 ："+ Arrays.toString(ints));
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
