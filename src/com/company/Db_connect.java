package com.company;
import javax.xml.transform.Result;
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

               // connection  variables
               String host2 = "127.0.0.1";
               String user = "root";
               String pass = "";


               //SQL querey string
               String str = "SELECT  * from referencer";


               // create the sql connection
               Connection con = DriverManager.getConnection(host2, user, pass);


               // create statement for database insert
               Statement st = con.createStatement();


               // execute querey   // change argumen to change to insert command
               ResultSet rs =  st.executeQuery(str);


              // GET THE STING FROM THE DATABASE // ARGUMENT LOOKS IN COLUMN 2.
               String name = rs.getString(2);
               // move the value to 2ND ROW TO GE STRING.
               rs. next();

               // close the connection to the db

               con.close();

               // print to terminal the content of reference table
               System.out.print(str + "your ref");


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


