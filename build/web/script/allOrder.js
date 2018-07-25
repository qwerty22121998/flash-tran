window.onload = function () {
    var order, id, name, add, date,status, id1, name1, add1, date1, status1,username;
    order = {
        "username": "Vuhkse05247",
        "orderID": "SWE00001",
        "orderName": "Laptop",
        "address": "Km29 Đại Học FPT",
        "date": "22/05/2018",
        "status": "Finding Shipper",
        "orderID1": "SWE00002",
        "orderName1": "Banana",
        "address1": "BigC Tran Duy Hung",
        "date1": "09/06/2018",
        "status1": "Transported",
    }
    id = order.orderID;
    name = order.orderName;
    add = order.address;
    date = order.date;
    status = order.status;
    id1 = order.orderID1;
    name1 = order.orderName1;
    add1 = order.address1;
    date1 = order.date1;
    status1 = order.status1;
    username = order.username
    document.getElementById("id").innerHTML = id;
    document.getElementById("name").innerHTML = name;
    document.getElementById("add").innerHTML = add;
    document.getElementById("date").innerHTML = date; 
    document.getElementById("status").innerHTML = status; 
    document.getElementById("id1").innerHTML = id1;
    document.getElementById("name1").innerHTML = name1;
    document.getElementById("add1").innerHTML = add1;
    document.getElementById("date1").innerHTML = date1; 
    document.getElementById("status1").innerHTML = status1; 
    document.getElementById("user").innerHTML = username; 
    
    
};