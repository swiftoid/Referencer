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
         // todo  This seems to work individually, needs modulating into main.java class..


public class Db_connect {

    // connection  variables
    // String host2 = "127.0.0.1";
    String user = "u603378190_admin";
    String pass = "Urigellar";
    // db is in host2 String db = "u603378190_ref";
    String host2 = "jdbc:mysql://mysql.hostinger.co.uk/u603378190_ref";


    public String connect(String data) {

        {


        }


        try

        {
            // create the sql connection
            Connection con = DriverManager.getConnection(host2, user, pass);
            System.out.println("Connected");
            Statement stmt = (Statement) con.createStatement();
            String ref_id = "22";
            String reference ="Johnson, W. 2010, The Flight of the lorax etc etc";
            String insert = "INSERT INTO 'JavaApp' , 'referencer' ('ref_id' , 'reference') VALUES ('"+ref_id+"','"+reference+"')";
            stmt.executeUpdate(insert);



        } catch (SQLException e) {

            System.err.println(e);
        }
    }
}









































