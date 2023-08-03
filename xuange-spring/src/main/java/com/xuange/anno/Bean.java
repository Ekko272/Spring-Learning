package com.xuange.anno;


import java.lang.annotation.*;

@Target(ElementType.TYPE)//指定类生效
@Retention(RetentionPolicy.RUNTIME)//运行时生效
public @interface Bean {
}
