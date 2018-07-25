/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Db.DBContext;
import Entity.User;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Date;

/**
 *
 * @author qwert
 */
public class userDAO {
    
    public User getUser(String uid) {
        try {
            String query = "select * from [user] where username = '" + uid + "'";
            System.out.println(query);
            Connection conn = DBContext.getConnection();
            ResultSet r = conn.prepareStatement(query).executeQuery();
            if (!r.next()) {
                return null;
            }
            String fullname = r.getString(2), email = r.getString(4), phone = r.getString(7), address = r.getString(8), desc = r.getString(9);
            Date dob = r.getDate(5);
            Boolean male = r.getBoolean(6);
            return new User(uid, fullname, email, address, desc, male, phone, dob);
        } catch (Exception ex) {
            return null;
        }
    }
    
    public User login(String uid, String pwd) {
        try {
            String query = "select * from [user] where username = '" + uid + "' and pwd = '" + pwd + "'";
            System.out.println(query);
            Connection conn = DBContext.getConnection();
            ResultSet r = conn.prepareStatement(query).executeQuery();
            if (!r.next()) {
                return null;
            }
            String fullname = r.getString(2), email = r.getString(4), phone = r.getString(7), address = r.getString(8), desc = r.getString(9);
            Date dob = r.getDate(5);
            Boolean male = r.getBoolean(6);
            return new User(uid, fullname, email, address, desc, male, phone, dob);
        } catch (Exception ex) {
            return null;
        }
    }
    
    public boolean newUser(User newUser) {
        try {
            String query = String.format("insert into [user] (username, fullname, pwd, email, dob, gender, phone, address, [desc])\n"
                    + "values ('%s','%s', '%s', '%s', '%s', %d, '%s', '%s', '%s')\n"
                    + " \n", newUser.getUsername(), newUser.getName(), newUser.getPwd(), newUser.getEmail(), Util.DateToString(newUser.getDob()), newUser.isMale() ? 1 : 0, newUser.getPhone(), newUser.getAddress(), newUser.getDesc());
            System.out.println(query);
            Connection conn = DBContext.getConnection();
            System.out.println(newUser.toString());
            return conn.prepareStatement(query).execute();
        } catch (Exception ex) {
            return false;
        }
    }
    
}
