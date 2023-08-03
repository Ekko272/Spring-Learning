package com.xuange.anno;
import java.lang.annotation.*;

@Target({ElementType.FIELD})//指定属性生效
@Retention(RetentionPolicy.RUNTIME)//运行时生效
public @interface Di {
}
