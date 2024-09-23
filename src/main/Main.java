/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author phong-hoang
 */
public class Main {
    public static void main(String[] args) {
        BSTree t = new BSTree();
        
        t.insert(new Student("12", "Phong", 3));
        t.insert(new Student("10", "hhhh", 3));
        t.insert(new Student("15", "hhhh", 3));
        t.insert(new Student("13", "hhhh", 3));
        
        t.visit(t.root.right.left);
    }
}
