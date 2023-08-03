package com.xuange.spring6.resource;

import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.net.MalformedURLException;

//演示urlResource访问网络资源
public class UrlResourceDemo {
    //访问前缀为http的资源
    public static void main(String[] args) {
        //http
        //loadUrlResource("http://www.google.com");
        loadUrlResource("file:xuange.txt");//根目录或绝对路径
    }

    public static void loadUrlResource(String path){
        try {
            UrlResource url = new UrlResource(path);
            System.out.println(url.getFilename());
            System.out.println(url.getURI());
            System.out.println(url.getDescription());
            System.out.println(url.getInputStream().read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
