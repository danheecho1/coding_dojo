var counts = [0, 0, 0];
var count_first = document.querySelector("#first_count");
var count_second = document.querySelector("#second_count");
var count_third = document.querySelector("#third_count");

function first() {
    counts[0] ++;
    count_first.innerHTML = counts[0];
}

function second() {
    counts[1] ++;
    count_second.innerHTML = counts[1];
}

function third() {
    counts[2] ++;
    count_third.innerHTML = counts[2];
}