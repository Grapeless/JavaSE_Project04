package com.File.Demo.Demo02;

import java.io.File;

public class Test_Amend {
    public static void main(String[] args) {
        delFile(new File("module03/IOStreamTest - 副本"));
    }

    public static void delFile(File f) {
        //空指针或错误的url
        if (f == null || !f.exists()) {
            return;
        }

        //是文件直接可删
        if (f.isFile()) {
            System.out.println(f.getName() + " " + f.length() + " " + f.delete());
        }

        //f是文件夹
        File[] files = f.listFiles();

        //f无访问权限
        if (files == null) {
            return;
        }

        //f为可访问。（空文件夹（非null)则遍历零次）
        for (File file : files) {
            //是文件直接可删
            if (file.isFile()) {
                System.out.println(file.getName() + " " + file.length() + " " + file.delete());
            } else delFile(file);  //否则递归删除下一的级文件
        }

        //f为空文件夹，（放在最后因为f删完它的下级文件后需要删除自己）
        if (files.length == 0) {
            System.out.println(f.getName() + " " + f.length() + " " + f.delete());
        }

    }

}
/*
        //f为空文件夹，（放在前面则无法最后删除自己）
        if (files.length==0) {
            System.out.println(f.getName()+" "+f.length()+" "+f.delete());
        }

        //f为非空文件夹且可访问
        for (File file : files) {
            //是文件直接可删
            if(f.isFile()){
                System.out.println(f.getName()+" "+f.length()+" "+f.delete());
            }else delFile(file);  //否则递归删除下一的级文件
        }
        */