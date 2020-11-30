package com.congzhang.java.README.wee8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListTest
 * @Description TODO
 * @Author zhangcong
 * @Date 2020/11/16
 **/
public class ListTest {
    public static void main(String[] args) {
        //船舰一个List接口的实现类的对象，泛型为String
        List<String> list = new ArrayList<>();
        //增加三个元素
        list.add("Java");
        list.add("JavaScript");
        list.add("Java");
        //随机去除list中的某个元素

        //同for循环遍历list
        System.out.println("用for循环遍历list");
        for (String s : list) {
            System.out.println(s + ",");
        }

        //用Iterator迭代器遍历list
        System.out.println("同Iterator迭代器遍历list");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+",");
        }

        //用lambda表达式遍历list
        System.out.println("用lambda表达式遍历list");
        list.forEach(s -> System.out.println());
        System.out.println("使用Lambda的方法应用来遍历list，终极简单版本");
        list.forEach(System.out::print);


        }
        }
