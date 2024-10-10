package com.Demo.Demo05;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> strList = new MyArrayList<>();
        strList.add("A");
        strList.add("B");
        strList.add("C");
        strList.add("D");
        System.out.println(strList.size());
        strList.add("E");
        System.out.println(strList.size());
        System.out.println(strList.get(4));
        System.out.println(strList.remove(0));
        System.out.println(strList);
        System.out.println(strList.remove(strList.size()-1));
        System.out.println(strList);

        MyArrayList<Integer> intList = new MyArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        System.out.println(intList);
        System.out.println(intList.get(0));
        System.out.println(intList.remove(0));
        System.out.println(intList.size());
        System.out.println(intList);

        intList.forEach(new ForEach<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer+" ");
            }
        });
        System.out.println();
        intList.forEach(integer -> System.out.print(integer+" "));


        MyArrayList<Student> objList = new MyArrayList<>();
        objList.add(new Student(18,180.0));
        objList.add(new Student(15,160.0));
        objList.add(new Student(23,175.0));
        System.out.println(objList);
        System.out.println(objList.get(0));
        System.out.println(objList.remove(0));
        System.out.println(objList.size());

        objList.forEach(student ->
                System.out.println("Age:"+student.getAge()+" Height:"+student.getHeight()));
    }
}
