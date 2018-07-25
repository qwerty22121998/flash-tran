window.onload = function () {
    var info = {
        "address": " Km29 Đại Lộ Thăng Long",
        "date": " 22/05/2018",
        "price": "$ 1.600.000 VNĐ",
        
    };

    var toLocation = 'Address: ' + info.address;
    var datee = info.date;
    var price = info.price;

    document.getElementById('to1').innerHTML = toLocation;
    document.getElementById('date1').innerHTML = datee;
    document.getElementById('price1').innerHTML = price;

    document.getElementById('to2').innerHTML = toLocation;
    document.getElementById('date2').innerHTML = datee;
    document.getElementById('price2').innerHTML = price;

    document.getElementById('to3').innerHTML = toLocation;
    document.getElementById('date3').innerHTML = datee;
    document.getElementById('price3').innerHTML = price;

    document.getElementById('to4').innerHTML = toLocation;
    document.getElementById('date4').innerHTML = datee;
    document.getElementById('price4').innerHTML = price;

    
};
