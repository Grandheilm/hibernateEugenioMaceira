package com.anahuac.desarrollo.capas.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import com.anahuac.desarrollo.capas.entidades.Libro;

public class DAOLibroSqlite implements IDAOLibro{
    
    public Connection getConnectio(){
        Connection con = null;
        try{
            String url = "C:\Users\elyix\OneDrive\Desktop\DB.BOOKS.db"
            con = DriverManager.getConnection(url);
        }
        catch(Exception e){
            System.out.println("Exception at connection" + e);
        }
        return con;
    }

    @Override
    public Libro createLibro(String nombre, String autor, String isbn, String editorial){

    }




}
