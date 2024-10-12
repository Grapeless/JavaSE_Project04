package com.File.Demo.Demo01;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        //File f = new File("D:\\Project\\IDEA\\JavaSE\\Project04\\module03");
        File f = new File("D:/");
        //System.out.println(Arrays.toString(f.list()));

        search(f);
    }

    /**
     *
     * @param f
     */
    public static void search(File f) {
        File[] files = f.listFiles();
        if (Objects.nonNull(files)) {   //空目录也会正常允许，但遇到无法读取文件时（为文件或文件对象不存在的情况在这里不会出现）会返回null
            for (int i = 0; i < files.length; i++) {
                if(files[i].isFile()){
                    if(files[i].getName().equals("QQ.exe")){
                        System.out.println(files[i].getAbsolutePath());
                        break;
                    }
                }else {
                    search(files[i]);
                }
            }
        }
    }
}
