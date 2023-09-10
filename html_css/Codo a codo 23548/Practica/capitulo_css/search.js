function searchImages() {
    var searchTerm = document.getElementById("searchTerm").value;
    var subscriptionKey = "TU_CLAVE_API_AQUI";
    var host = "https://api.cognitive.microsoft.com";
    var path = "/bing/v7.0/images/search";
    var request = new XMLHttpRequest();
    request.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var response = JSON.parse(this.responseText);
            displayResults(response);
        }
    };
    request.open("GET", host + path + "?q=" + encodeURIComponent(searchTerm));
    request.setRequestHeader("Ocp-Apim-Subscription-Key", subscriptionKey);
    request.send();
}

function displayResults(response) {
    var resultsDiv = document.getElementById("results");
    resultsDiv.innerHTML = "";
    for (var i = 0; i < response.value.length; i++) {
        var img = document.createElement("img");
        img.src = response.value[i].thumbnailUrl;
        resultsDiv.appendChild(img);
    }
}