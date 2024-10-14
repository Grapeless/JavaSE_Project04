package com.iostream.Demo.Demo02;

import java.io.*;
import java.util.*;

public class Test {
    //调整文件中每行文本的顺序
    public static void main(String[] args) {
        try(
                Reader reader = new FileReader("module03/IOStreamTest/2/A.txt");
                Writer writer = new FileWriter("module03/IOStreamTest/2/B.txt",false);

                BufferedReader bReader = new BufferedReader(reader);
                BufferedWriter bWriter = new BufferedWriter(writer)
                ){
            Map<Integer,String> strList = new TreeMap<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1 - o2;
                }
            });
            String str;
            while ((str = bReader.readLine())!=(null) ){
               strList.put(Integer.parseInt(str.substring(0,1)),str);
            }
            //System.out.println(strList);
            int len;
            strList.forEach((k,v)->{
                try {
                    bWriter.write(v);
                    bWriter.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
