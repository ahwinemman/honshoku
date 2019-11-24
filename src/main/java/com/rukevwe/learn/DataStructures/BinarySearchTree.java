package com.rukevwe.learn.DataStructures;

public class BinarySearchTree {
}

class BinarySearchTreeNode {
    
    BinarySearchTreeNode left, right;
    int data;
    
    public BinarySearchTreeNode(int data) {
        this.data = data;
    }
    
    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data){
            if (left == null) {
                return false;
            } else {
                left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                right.contains(value);
            }
        }
        return false;
    }
    
    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }
    
    public void printPreOrder() {
        System.out.println(data);
        if (left != null) {
            left.printInOrder();
        }
        if (right != null) {
            right.printInOrder();
        }
    }
    public void printPostOrder() {
        if (left != null) {
            left.printInOrder();
        }
        if (right != null) {
            right.printInOrder();
        }
        System.out.println(data);
    }
}
