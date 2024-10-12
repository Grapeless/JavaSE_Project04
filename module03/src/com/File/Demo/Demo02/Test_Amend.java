package com.File.Demo.Demo02;

import java.io.File;
import java.util.Arrays;

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
            } else {
                delFile(file);
            } //否则递归删除下一的级文件
        }

        System.out.println(Arrays.toString(f.list()));

        /*
        //该段代码有变量更新滞后问题，以致于删除非空文件夹的所以子文件夹后，files.length无法及时更新至0，导致无法删除它本身
        if (files.length == 0) {
            System.out.println(f.getName() + " " + f.length() + " " + f.delete());
        }
        */

        if (f.list().length == 0) {
            System.out.println(f.getName() + " " + f.length() + " " + f.delete());
        }

    }

}
