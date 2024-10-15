package com.iostream.Demo.Demo04;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        try {
            //拷贝文件
            FileUtils.copyFile(new File("module03/IOStreamTest/C.txt"),
                    new File("module03/IOStreamTest/2/C.txt"));
            //拷贝文件夹
            FileUtils.copyDirectory(new File("module03/IOStreamTest/1"),
                    new File("module03/IOStreamTest/3"));
            //删除文件夹
            FileUtils.deleteDirectory(new File("module03/IOStreamTest/3"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
