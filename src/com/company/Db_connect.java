package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;
import java.sql.*;


/**
 * Created by Andy on 02/01/2016.
 */
;

public class Db_connect {

       public String connect(String data) {

           {



           }
           try

           {

               String host2 = "jdbc:derby://localhost:1527/Employees";
               //String host1 = "localhost";
               String user = "root";
               String pass = "Jim1doogan";





               Connection con = DriverManager.getConnection(host2, user, pass);
           } catch (
                   SQLException err
                   )

           {

               System.out.println(err.getMessage());

           }


           String data2 = data ;
           return data2;

       }
}


