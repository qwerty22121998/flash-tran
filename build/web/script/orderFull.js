window.onload = function () {
    var order1 = {
        "owner": "Vuhkse05247 ",
        "id": "VC01",      
        "ownerPhone": "0969622396",
        "expired": "15/6/2018",
        "ordername": "Laptop",
        "to": "Tran Duy Hung",
        "reciever": "Cena",
        "recieverPhone": "09856352132",
        "status": "Being transported",
    };
    var acc = order1.owner;
    var id = 'ID number: ' + order1.id
    var ordername = order1.ordername;
    var toLocation = order1.to + " " + order1.expired;
    var infor = 'Owner: ' + order1.owner
        + '<br></br>' + 'Owner Phone: ' + order1.ownerPhone
        + '<br></br>' + 'Status: ' + order1.status
    var reciever = 'Reciever: ' + order1.reciever
        + '<br></br>' + 'Reciever Phone: ' + order1.recieverPhone
    
    
    document.getElementById('fromer').innerHTML = ordername;
    document.getElementById('to').innerHTML = "To: " + toLocation;
    document.getElementById('order').innerHTML = infor;
    document.getElementById('reciever').innerHTML = reciever;
    document.getElementById('id').innerHTML = id;
    document.getElementById('hello1').innerHTML = acc;
    
   
};