/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author phong-hoang
 */
public class Student {
    String id;
    String name;
    int age;

    public Student() {
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "["+ id + ", " + name + ", " + age + "]";
    }
    
    public int compareTo(Student s){
        return id.compareTo(s.id);
    }
    
}
