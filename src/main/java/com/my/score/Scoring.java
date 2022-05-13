package com.my.score;


import java.util.ArrayList;
import java.util.List;

public class Scoring {
        public static void main(String[] args) {
            Student jack=new Student("Jack",70,88);
            Student hank= new Student("Hank",60,30);
            GraduateStudent jane = new GraduateStudent("Jane",65,82,79);
            List<Student> student=new ArrayList<>();
            student.add(jack);
            student.add(hank);
            student.add(jane);
            for(int i=0;i<student.size();i++){
                Student stu=student.get(i);
                stu.print();
            }
        }
    }
    
