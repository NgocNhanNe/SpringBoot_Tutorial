package com.example.demo.model.newDI;

public class ConnectionDB {
    private SQLDAO sqldao;
    public void connection(SQLDAO sqldao){

    }

    public SQLDAO getSqldao() {
        return sqldao;
    }

    public void setSqldao(SQLDAO sqldao) {
        this.sqldao = sqldao;
    }

    public ConnectionDB(SQLDAO sqldao) {
        this.sqldao = sqldao;
    }

    public static void main(String[] args) {
//        SQLDAO sqldao = new MySQLDAO();
//        ConnectionDB connectionDB = new ConnectionDB(sqldao);
//        connectionDB.getSqldao().showConnect();

        SQLDAO sqldao = new PostgresDAO();
        ConnectionDB connectionDB = new ConnectionDB(sqldao);
        connectionDB.getSqldao().showConnect();
    }
}
