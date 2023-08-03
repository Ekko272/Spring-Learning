package com.xuange.spring6.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.File;

public class FileSystemResourceDemo {
    public static void loadFileResource(String path){
        FileSystemResource resource = new FileSystemResource(path);
        File file = resource.getFile();
        System.out.println(file);
    }
}
