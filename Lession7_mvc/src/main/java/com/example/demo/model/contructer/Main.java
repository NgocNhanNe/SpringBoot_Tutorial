package com.example.demo.model.contructer;

public class Main {
    public static void main(String[] args) {
        DongCo dongCo = new DongCo();
        BanhXe banhXe = new BanhXe();
        Car car = new Car(dongCo,banhXe);
        car.getDongCo().start();
    }
}
