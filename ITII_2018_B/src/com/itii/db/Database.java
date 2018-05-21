package com.itii.db;

import java.sql.*;
import java.util.ArrayList;

public class Database {

    private static final String TABLE_NAME = "Tasks";
    private static final String FIELD_ID = "id";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_DATE = "date";
    private static final String FIELD_DETAILS = "details";
    private static final String FIELD_STATE = "state";
    
    static Connection connection = null;
    static Statement statement = null;


    public static boolean createTable(){
        try {
            connection = DriverManager .getConnection("jdbc:sqlite:database/planning.db");


            String sqlCreate = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " ( "
                    + FIELD_ID + " integer primary key autoincrement, " // Primary key
                    + FIELD_NAME + " string, " // Name
                    + FIELD_DATE + " text, " // Details
                    + FIELD_DETAILS + " text, " // date as ISO8601 strings ("YYYY-MM-DD HH:MM:SS.SSS").
                    + FIELD_STATE + " boolean " + " )"; // marquée
            System.out.println("table \"" + TABLE_NAME + "\" créée ou existante ");

            Statement stmt = connection.createStatement();
            stmt.execute(sqlCreate);
        } catch (SQLException e) {
            System.out.println(" Erreur : Table non créée");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void addTask(String name, String date, String details, boolean state){
        try {
            connection = DriverManager .getConnection("jdbc:sqlite:database/planning.db");

        PreparedStatement stmt = connection.prepareStatement(
                "insert into " + TABLE_NAME + " ( " + FIELD_NAME + ","
                        + FIELD_DATE + "," + FIELD_DETAILS + ","
                        + FIELD_STATE + " ) " + "values ( ?, ?, ?, ?) ");
        stmt.setString(1, name);
        stmt.setString(2, date);
        stmt.setString(3, details);
        stmt.setString(4, state ? "1" : "0");
        stmt.executeUpdate();
        System.out.println("insertion d'une nouvelle entrée dans la table");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void deleteTask(String name){
    	try {
            statement.executeUpdate("delete from " + TABLE_NAME + " where name = '" + name +"';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> getAllTasks() {
        ArrayList result = new ArrayList();
        try {
            connection = DriverManager .getConnection("jdbc:sqlite:database/planning.db");
            statement = connection.createStatement();

        ResultSet rs = statement.executeQuery("select * from " + TABLE_NAME);
        while (rs.next()){
            String t = rs.getString(FIELD_NAME)+";";
            t+= rs.getString(FIELD_DATE)+";";
            t+= rs.getString(FIELD_DETAILS);

            result.add(t);

        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }

}
