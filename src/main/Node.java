/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author phong-hoang
 */
public class Node {

    Node left;
    Node right;
    Student info;

    Node() {
    }

    Node(Student info) {
        left = right = null;
        this.info = info;
    }

    Node(Node left, Node right, Student info) {
        this.left = left;
        this.right = right;
        this.info = info;
    }
    
}
