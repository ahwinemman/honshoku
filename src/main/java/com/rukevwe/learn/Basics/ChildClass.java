package com.rukevwe.learn.Basics;

public class ChildClass extends ParentClass {

    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass() {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        parentClass.equals(new ChildClass());
    }
}
