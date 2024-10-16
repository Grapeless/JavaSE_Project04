package com.XML;


import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Test {
    //extensible markup language 可扩展标记语言
    public static void main(String[] args) {
        //1.创建一个解析器对象
        SAXReader saxReader = new SAXReader();

        try {
            //2.将需要解析的xml文件解析成一个Document对象
            Document document = saxReader.read("module04/src/com/XML/test01.xml");

            //3.解析对象

            //3.1获取根元素对象
            Element rootElement = document.getRootElement();
            System.out.println(rootElement.getName());

            //3.2获取一级子元素的集合
            List<Element> elements = rootElement.elements();
            for (Element element : elements) {
                System.out.println(element.getName());
            }

            //3.3指定一级子元素的集合
            List<Element> elements1 = rootElement.elements("people");
            for (Element element : elements1) {
                System.out.println(element.getName());
            }

            //3.4拿到的是第一个出现的该子元素
            Element user = rootElement.element("user");

            //3.5文本内容
            System.out.println(user.getText());
            System.out.println(user.getTextTrim());  //去空格
            System.out.println(rootElement.element("people").getText());
            System.out.println(user.elementText("name"));
            System.out.println(user.elementText("address"));

            //3.6获取标签属性信息
            System.out.println(user.attributeValue("id"));
            //或者拿到属性对象后 .attribute .attributes
            Attribute id = user.attribute("id");
            System.out.println(id.getName());

            //总之是自顶向下的对象
            /*document.getRootElement();
            rootElement.element("user");
            user.element("name");
            user.attribute("id");*/


        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }

    }
}
