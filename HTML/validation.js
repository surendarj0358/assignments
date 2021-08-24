function checkEmail() {
    var email = document.getElementById("mail").value;
    console.log(email);
    var correctEmail = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    if (email.match(correctEmail)) {
        return true
    } else {
        alert("Invalid ID");

    }
}



function checkPassword() {
    var password = document.getElementById("password").value;
    console.log("");
    var correctPassword = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
    if (password.match(correctPassword)) {
        return true
    } else {
        alert('Password should have: 8 to 15 characters which contains at least one lowercase letter, one uppercase letter, one number and one special character')

    }
}