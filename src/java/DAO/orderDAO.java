/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Db.DBContext;
import Entity.Order;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qwert
 */
public class orderDAO {

    public int generateNewId() {
        while (true) {
            try {
                int number = new Random().nextInt(Integer.MAX_VALUE);
                String query = "select * from [order] where id = " + number;
                Connection conn = DBContext.getConnection();
                ResultSet r = conn.prepareStatement(query).executeQuery();
                if (!r.next()) {
                    return number;
                }
            } catch (Exception ex) {
                Logger.getLogger(orderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public int InsertOrder(Order newOrder) {
        try {
            int id = generateNewId();
            newOrder.setId(id);
            String query = String.format("insert into [order] (id, [uid], shipid, start, dest, price, startDate, expiredDate, rName, rPhone, [desc], name)\n"
                    + "values ('%d', N'%s', N'%s', N'%s', N'%s', N'%s', N'%s',N'%s', N'%s', N'%s', N'%s', N'%s')", id, newOrder.getUid(), newOrder.getShipid(), newOrder.getStart(), newOrder.getDest(), newOrder.getPrice(), Util.DateToString(newOrder.getStartDate()), Util.DateToString(newOrder.getExpiredDate()), newOrder.getrName(), newOrder.getrPhone(), newOrder.getDesc(), newOrder.getName());
            System.out.println(query);
            return DBContext.getConnection().prepareStatement(query).executeUpdate();
        } catch (Exception ex) {
            return 0;
        }
    }

    public Order getOrder(int id) {
        try {
            String query = "select * from [order] where id=" + id;
            ResultSet result = DBContext.getConnection().prepareStatement(query).executeQuery();
            if (!result.next()) {
                return null;
            }
            String uid, shipid, start, dest, price, rName, rPhone, desc, name;
            Date startDate, expiredDate;
            uid = result.getString(2);
            shipid = result.getString(3);
            shipid = shipid.equals("null") ? null : shipid;
            start = result.getString(4);
            dest = result.getString(5);
            price = result.getString(6);
            startDate = result.getDate(7);
            expiredDate = result.getDate(8);
            rName = result.getString(9);
            rPhone = result.getString(10);
            desc = result.getString(11);
            name = result.getString(12);
            return new Order(uid, shipid, start, dest, name, price, rName, rPhone, desc, startDate, expiredDate);

        } catch (Exception ex) {
            return null;
        }
    }
}
