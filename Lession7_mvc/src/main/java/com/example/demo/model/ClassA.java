package com.example.demo.model;

public class ClassA {
    private ClassB classB;

    public ClassA(){
        this.classB = new ClassB();
    }

    public ClassB getClassB() {
        return classB;
    }

    public void setClassB(ClassB classB) {
        this.classB = classB;
    }

    //no by Dependency Injection
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = classA.getClassB();
        classB.showMessage();
    }
}
