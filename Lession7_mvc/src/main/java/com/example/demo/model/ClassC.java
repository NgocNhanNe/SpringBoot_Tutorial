package com.example.demo.model;

public class ClassC {
    private ClassB classB;
    public ClassC(ClassB classB) {
            this.classB = classB;
    }

    public ClassB getClassB() {
        return classB;
    }

    public void setClassB(ClassB classB) {
        this.classB = classB;
    }

    //using DI
    public static void main(String[] args) {
        ClassB classB = new ClassB();
        ClassC classC = new ClassC(classB);
        ClassB classBTemp = classC.getClassB();
        classBTemp.showMessage();
    }
}
