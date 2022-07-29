package com.w1;

import com.w1.service.impl.Genshin;
import org.junit.Test;

/**
 * @author mingyifan
 * @date 2022-07-29 17:16
 */
public class test11 {
    private Long sum=100000L;

    @Test
    public void test13(){
        Genshin genshin = new Genshin(1,73L,6,0.6,101);
        genshin.tenFire(sum);
    }

    @Test
    public void Arknights13(){
        Genshin genshin = new Genshin(1,50L,2,2,101);
        genshin.tenFire(sum);
    }

    @Test
    public void HearthStone13(){
        Genshin genshin = new Genshin(1,sum+1,2,1,101);
        genshin.tenFire(sum);
    }
}
