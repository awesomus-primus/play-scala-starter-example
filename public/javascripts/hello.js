if (window.console) {
    console.log("Welcome to your Play application's JavaScript!");
}

function addRows() {
    var table = document.getElementById("influencers");
    var row = table.insertRow();
    var name = row.insertCell(0);
    var industry = row.insertCell(1);
    name.innerHTML("A name");
    industry.innerHTML("An industry");
}

function myMap() {
    var mapOptions = {
        center: new google.maps.LatLng(51.5, -0.12),
        zoom: 10,
        mapTypeId: google.maps.MapTypeId.HYBRID
    }
    var map = new google.maps.Map(document.getElementById("map"), mapOptions);
}
