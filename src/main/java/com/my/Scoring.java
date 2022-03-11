package com.my;

    public class Scoring {
        public static void main(String[] args) {
            Student jack=new Student("Jack",70,88);
            Student hank= new Student("Hank",60,30);
            GraduateStudent jane = new GraduateStudent();
            jane.name="Jane";
            jack.print();
            hank.print();
            jane.print();
        }
    }
    
