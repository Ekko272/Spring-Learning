package com.xuange.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {
    @Test
    public void testSetter(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book",Book.class);
        System.out.println(book);

        Book book2 = context.getBean("bookCon",Book.class);
        System.out.println(book2);
    }
}
