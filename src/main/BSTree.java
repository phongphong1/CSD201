/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author phong-hoang
 */
public class BSTree {

    Node root;
    
    BSTree() {
        root = null;
    }
    
    void clear() {
        root = null;
    }
    
    boolean isEmpty() {
        return root == null;
    }
    
    void insert(Student s) {
        if (isEmpty()) {
            root = new Node(s);
            return;
        }
        Node p = root;
        while (true) {         
            if (p.info == s){
                System.out.println("Already exist!");
                return;
            }
            else if (p.info.compareTo(s) < 0) {
                if (p.right == null) {
                    p.right = new Node(s);
                    return;
                }
                p = p.right;
            } else {
                if (p.left == null) {
                    p.left = new Node(s);
                    return;
                }
                p = p.left;
            }
        }
    }
    
    Node search(Student s){
        if (isEmpty())
            return null;
        Node p = root;
        
        while(p != null){
            if (p.info == s){
                return p;
            }
            if (p.info.compareTo(s) < 0){
                p = p.right;
            }else{
                p = p.left;
            }
        }
        return null;
    }
    
    void visit(Node p){
        System.out.println(p.info.toString() + " ");
    }
    
    void breath(){
        Node p = root;
        Queue<Node> q = new LinkedList<>();
        
    }
}
