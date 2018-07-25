/* global google */

calculateAndDisplayRoute = (start, end, directionsService, directionsDisplay) => {
    console.log(start.getPlaces() + " " + end.getPlaces());
    if (!start.getPlaces() || !end.getPlaces()) {

        return;
    }
    directionsService.route({
        origin: start.getPlaces()[0].geometry.location,
        destination: end.getPlaces()[0].geometry.location,
        travelMode: 'DRIVING'
    }, (response, status) => {
        if (status === 'OK') {
            directionsDisplay.setDirections(response);

        } else {
            window.alert('Directions request failed due to ' + status);
        }
    }
    );
};

calculateAndDisplayRoutePlace = (start, end, directionsService, directionsDisplay) => {

    directionsService.route({
        origin: start.geometry.location,
        destination: end.geometry.location,
        travelMode: 'DRIVING'
    }, (response, status) => {
        if (status === 'OK') {
            directionsDisplay.setDirections(response);

        } else {
            window.alert('Directions request failed due to ' + status);
        }
    }
    );
};


placeMarker = (searchBox, points, map) => {
    let places = searchBox.getPlaces();
    if (!places) {
        return;
    }
    points.forEach(marker => {
        marker.setMap(null);
    });
    points = [];
    let bounds = new google.maps.LatLngBounds();
    places.forEach(place => {
        if (!place.geometry) {
            console.log("Returned place contains no geometry");
            return;
        }
        let icon = {
            url: place.icon,
            size: new google.maps.Size(71, 71),
            origin: new google.maps.Point(0, 0),
            anchor: new google.maps.Point(17, 34),
            scaledSize: new google.maps.Size(25, 25)
        };
        points.push(new google.maps.Marker({
            map: map,
            icon: icon,
            title: place.name,
            position: place.geometry.location
        }));

        if (place.geometry.viewport) {
            bounds.union(place.geometry.viewport);
        } else {
            bounds.extend(place.geometry.location);
        }
    });
    map.fitBounds(bounds);
};

loadItemToMap = (mapId, startId, endId, lat = 21.0133687, lng = 105.5251002) => {


    let directionsService = new google.maps.DirectionsService;
    let directionsDisplay = new google.maps.DirectionsRenderer;
    let map = new google.maps.Map(document.getElementById(mapId), {
        center: {lat: lat, lng: lng},
        zoom: 17,
        mapTypeId: 'roadmap'
    });
    directionsDisplay.setMap(map);
    let inputStart = document.getElementById(startId);
    let inputEnd = document.getElementById(endId);
    let searchBoxStart = new google.maps.places.SearchBox(inputStart);
    let searchBoxEnd = new google.maps.places.SearchBox(inputEnd);
    // Bias the SearchBox results towards current map's viewport.
    map.addListener('bounds_changed', () => {
        searchBoxEnd.setBounds(map.getBounds());
        searchBoxStart.setBounds(map.getBounds());
    });
    let fromP = {query: document.getElementById(startId).value};
    let destP = {query: document.getElementById(endId).value};
    let placeSearch = new google.maps.places.PlacesService(map);
    placeSearch.textSearch(fromP, (results, status) => {
        if (status === google.maps.places.PlacesServiceStatus.OK) {
            //grab the first item, Orlando, Florida, USA
            var from = results[0];
            placeSearch.textSearch(destP, (results1, status1) => {
                if (status1 === google.maps.places.PlacesServiceStatus.OK) {
                    //grab the first item, Orlando, Florida, USA
                    var to = results1[0];
                    calculateAndDisplayRoutePlace(from, to, directionsService, directionsDisplay, map);
                }
            });
        }
    })



    searchBoxEnd.addListener('places_changed', () => calculateAndDisplayRoute(searchBoxStart, searchBoxEnd,
                directionsService, directionsDisplay, map));
    searchBoxStart.addListener('places_changed', () => calculateAndDisplayRoute(searchBoxStart, searchBoxEnd,
                directionsService, directionsDisplay, map));
}