package com.sxwl.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
       final Producer producer=new  Producer();
        IProducer iProducer= (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(),
                producer.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Float moey=(Float) args[0];
                        Object invoke=null;
                        if("saleProduct".equals(method.getName())){
                            invoke = method.invoke(producer, moey*0.8f);
                        }
                        return invoke;
                    }
                });
        iProducer.afterService(10000f);
    }
}
