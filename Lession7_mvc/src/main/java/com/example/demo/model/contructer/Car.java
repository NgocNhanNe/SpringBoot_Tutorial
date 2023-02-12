package com.example.demo.model.contructer;

public class Car {
    private DongCo dongCo;
    private BanhXe banhXe;

    //using constructor

    public Car(DongCo dongCo, BanhXe banhXe) {
        this.dongCo = dongCo;
        this.banhXe = banhXe;
    }

    public DongCo getDongCo() {
        return dongCo;
    }

    public void setDongCo(DongCo dongCo) {
        this.dongCo = dongCo;
    }

    public BanhXe getBanhXe() {
        return banhXe;
    }

    public void setBanhXe(BanhXe banhXe) {
        this.banhXe = banhXe;
    }
}
