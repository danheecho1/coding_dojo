var count = 0; 
var displayed_count = document.querySelector("#count");

function like() {
    count += 1;
    displayed_count.innerHTML = count;
}