/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author qwert
 */
public class Order {

    private int id;
    private String uid, shipid, start, dest, name, price, rName, rPhone, desc;
    private Date startDate, expiredDate;

    public Order(String uid, String shipid, String start, String dest, String name, String price, String rName, String rPhone, String desc, Date startDate, Date expiredDate) {
        this.uid = uid;
        this.shipid = shipid;
        this.start = start;
        this.dest = dest;
        this.name = name;
        this.price = price;
        this.rName = rName;
        this.rPhone = rPhone;
        this.desc = desc;
        this.startDate = startDate;
        this.expiredDate = expiredDate;
    }

    public int getId() {
        return id;
    }

    public String getUid() {
        return uid;
    }

    public String getShipid() {
        return shipid;
    }

    public String getStart() {
        return start;
    }

    public String getDest() {
        return dest;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getrName() {
        return rName;
    }

    public String getrPhone() {
        return rPhone;
    }

    public String getDesc() {
        return desc;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setShipid(String shipid) {
        this.shipid = shipid;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public void setrPhone(String rPhone) {
        this.rPhone = rPhone;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

}
