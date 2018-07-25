window.onload = function () {
    var info = {

        "owner": "Vuhkse05247   ", //username cua chu hang
        "ownerPhone": "0969622396",
        "addressFrom": "Nghe An",
        "addressTo": "Km29 Đại Lộ Thăng Long",
        "date": "22/05/2018",
        "ordersname": "Laptop",
        "desc": "Đây là một cái Descripton"
    };
    var fromLocation = 'From: ' + info.addressFrom;
    var toLocation = 'To: ' + info.addressTo;
    var human2 = info.owner;
    var human = 'Order Name: ' + info.ordersname
        + '<br></br>' + 'Owner: ' + info.owner
        + '<br></br>' + 'Owner Phone: ' + info.ownerPhone
        + '<br></br>' + 'Expired Date: ' + info.date;
    +'<br></br>' + 'Description: ' + info.desc;
    var datee = info.date;

    document.getElementById('to').innerHTML = toLocation;
    document.getElementById('fromer').innerHTML = fromLocation;
    document.getElementById('human').innerHTML = human;
    document.getElementById('hello').innerHTML = human2;


};
