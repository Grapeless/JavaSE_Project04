package com.File.Demo.Demo01;

import java.io.File;

public class Test_Amend {
    public static void main(String[] args) {
        searchFile(new File("D:/"),"QQ.exe");
    }

    //  slash+*+*+enter  标准注释
    /**
     * @param f   目录
     * @param fileName   要搜索的文件名称
     */
    public static void searchFile(File f, String fileName) {
        //1.非法情况
        if (f == null || !f.exists() || f.isFile()) {    //为空（即没指向文件，也没指向（空的)文件夹），不存在，为文件
            return;
        }
        //此时f一定指代一个文件夹
        File[] files = f.listFiles();
        //2.f是否为空文件夹及是否不可读导致files为空（length==0)或null(抛出空指针)  //前面算是合法情况？
        if (files != null && files.length > 0) {
            //3.再遍历files，每次判断为文件或文件夹
            for (File file : files) {
                if (file.isFile()) {   //为文件
                    if (file.getName().equals(fileName)) {
                        System.out.println(file.getAbsolutePath());
                    }
                } else searchFile(file, fileName);   //为文件夹，则递归访问
            }
        }
    }

}
