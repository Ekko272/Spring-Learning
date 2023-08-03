package com.xuange.spring6.iocxml.beanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


//bean的后置处理器。在执行前或执行后进行自定义的bean逻辑操作或配置
public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After....");
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Before....");
        return bean;
    }
}
