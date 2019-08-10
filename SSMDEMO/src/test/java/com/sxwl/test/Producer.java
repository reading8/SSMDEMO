package com.sxwl.test;

/**
 * 生产者
 */
public class Producer implements  IProducer {
    /**
     * 销售
     * @param money
     */
    public  void saleProduct(Float money){
        System.out.println("拿到钱"+money);
    }

    /**
     * 售后
     * @param money
     */
    public  void afterService(float money){
        System.out.println("兄啊受"+money);
    }
}
