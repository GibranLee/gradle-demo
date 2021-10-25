package com.dalelee.map;

import com.dalelee.gradledemo.dypr.Student;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @Description:
 * @Author: lizhouyou
 * @Create: 2021-04-25 20:52
 **/
public class TreeMapTest {
    public static void main(String[] args) {
        List list = new CopyOnWriteArrayList();
        HashMap hashMap = new HashMap();
        Collections.synchronizedMap(hashMap);
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        TreeMap<Student, String> map = new TreeMap<Student, String>((o1, o2) -> {
            //主要条件 正序排列
            int num = o1.getAge() - o2.getAge();

            //次要条件 interface comparable ，compareTo接口
            int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;

            return num2;
        });

        //创建学生对象
        Student s1 = new Student("潘安", 36);
        Student s2 = new Student("柳下惠", 35);

        //添加元素进集合
        map.put(s1, "宋朝");
        map.put(s2, "元朝");
        //map.put(null, "汉朝");

        //获取key集合
        Set<Student> set = map.keySet();

        //遍历key集合
        for (Student student : set) {
            String value = map.get(student);
            System.out.println(student + "---------" + value);
        }
    }
}
