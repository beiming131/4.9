package com.itheima.controller;

import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Field;
import java.nio.channels.Channel;
import java.util.HashMap;
import java.util.Map;

public class Demo implements Comparable {
   static int i;
    public static void main(String[] args) throws CloneNotSupportedException {


        Person p1 = new Person("1", 23);

        String s = String.valueOf(1);

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Person  {


    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}