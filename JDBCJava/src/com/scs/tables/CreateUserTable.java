package com.scs.tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by pankajs on 5/2/2016.
 */
public class CreateUserTable {

    public static void main(String[] args) {
        try{
            Connection conn = getConnections();
            Statement stmt = conn.createStatement();

            String sql = "CREATE  TABLE `User` "+
           "( `id` INT NOT NULL AUTO_INCREMENT , "+
            "`name` VARCHAR(45) NULL , "+
               "`age` VARCHAR(45) NULL , "+
                "`email` VARCHAR(45) NULL , "+
                 "PRIMARY KEY (`id`));";

                boolean result = stmt.execute(sql);
            System.out.println(result);

            stmt.close();
            conn.close();

        }catch (Exception e){
                e.printStackTrace();
        }
    }

    private static Connection getConnections() {
        Connection con = null;
        String dbDriver = "com.mysql.jdbc.Driver";
        String dbUserName = "root";
        String dbUserPassword = "x0we0ps";
        String dbHostName = "localhost";
        String dbPort = "3306";
        String schema = "jdbc_project";

        try{
            String url = "jdbc:mysql://"+dbHostName+":"+dbPort+"/"+schema;
            Class.forName(dbDriver);

            con = DriverManager.getConnection(url,dbUserName, dbUserPassword);

            System.out.println("Connected to MY SQL DB");
        } catch (ClassNotFoundException ex1){
            System.out.println("Failed to find driver Class " + ex1.getMessage());
            System.exit(1);
        } catch (SQLException ex2){
            System.out.println("Connection Failed " + ex2.getMessage());
            System.exit(2);
        }
        return con;
    }
}
