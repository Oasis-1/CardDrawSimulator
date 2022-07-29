package com.w1.service;

/**
 * 抽象类中定义--->出橙概率
 *          ---->保底开始计算
 *          ----->保底每次加多少
 * @author mingyifan
 * @date 2022-07-29 17:02
 */
public abstract class CommonService {
    public CommonService(Integer guaranteed, Long startGuaranteed, double guaranteedAdd, double orange, Integer percentage) {
        this.guaranteed = guaranteed;
        this.startGuaranteed = startGuaranteed;
        this.guaranteedAdd = guaranteedAdd;
        this.orange = orange;
        this.percentage = percentage;
    }

    /**
     *  保底默认值
     */
    public Integer guaranteed =1;
    /**
     * 开始计算保底
     */
    public Long startGuaranteed=1L;
    /**
     * 保底每次加多少
     */
    public double guaranteedAdd;
    /**
     *  出橙概率
     */
    public double orange;
    /**
     *     百分比--默认100
     */
    public Integer percentage=101;

    public abstract void  tenFire(long sum);
    /**
     *  单抽
     *  @return java.lang.Boolean 是否出橙
     *  mingyifan
     *  2022/7/29 17:14
     */
    public Boolean singleFire(){
        double n = Math.random() * percentage;
        if (guaranteed <=startGuaranteed){
            if (n<=orange){
                return true;
            }
        }else {
            double v = ((guaranteed - startGuaranteed) * startGuaranteed) + orange;
            if (n<=v){
                return true;
            }
        }
        return false;
    }
}
