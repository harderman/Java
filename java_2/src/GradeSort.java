package com.bittech.hello;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Student{
    public String name;
    public int grade;
    Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
}

public class GradeSort {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int number = sca.nextInt();
            int way = sca.nextInt();
            List<Student> list = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                list.add(new Student(sca.next(), sca.nextInt()));
            }
            if(way == 0){
                list.sort((o1, o2) -> o2.grade - o1.grade);
            }
            if(way == 1){
                list.sort(Comparator.comparingInt(o -> o.grade));

            }
            for (Student student:list) {
                System.out.println(student.name+" "+student.grade);
            }
        }
    }
}
