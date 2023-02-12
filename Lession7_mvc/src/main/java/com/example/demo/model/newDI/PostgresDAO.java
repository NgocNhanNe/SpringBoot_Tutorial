package com.example.demo.model.newDI;

public class PostgresDAO implements SQLDAO{

    @Override
    public void showConnect() {
        System.out.println("connected Postgres");
    }
}
