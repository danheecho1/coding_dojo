function edit_profile() {
    user_name.innerHTML = "John Wick"
}

function accept_first() {
    number_of_requests.innerText --; 
    number_of_connections.innerText ++;
    first_request.remove();
}

function decline_first() {
    number_of_requests.innerText --; 
    first_request.remove()
}

function accept_second() {
    number_of_requests.innerText --; 
    number_of_connections.innerText ++;
    second_request.remove();
}

function decline_second() {
    number_of_requests.innerText --; 
    second_request.remove();
}