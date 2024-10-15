package com.Test.Test03;

import org.apache.commons.io.FileUtils;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File f = new File("module03/IOStreamTest/1/2");
        System.out.println(f.listFiles().length);
    }
}
