package com.xuange.spring6.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

//访问类路径(/resources)下的资源
public class ClassPathResourceDemo {
    public static void loadClasspathResource(String path) throws IOException {
        ClassPathResource resource = new ClassPathResource(path);
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());

        InputStream in = resource.getInputStream();
        byte[] b = new byte[1024];
        while(in.read(b) != -1){
            System.out.println(new String(b));
        }
    }


    public static void main(String[] args) throws IOException {
        loadClasspathResource("xuange.txt");
    }
}
