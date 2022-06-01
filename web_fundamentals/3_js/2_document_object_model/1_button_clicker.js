function login_out(elem) {
    if (elem.innerText == "Login") {
        elem.innerText = "Logout"
    }
    else {
        elem.innerText = "Login"
    }
}

function add_definition(elem) {
    elem.remove();
}

function like() {
    alert("Ninja was liked")
}