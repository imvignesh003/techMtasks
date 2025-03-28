function verifyAge() {
    let ageStr = document.getElementById("userAge").value;
    let age = Number(ageStr);

    if (isNaN(age) || age <= 0) {
        alert("Please enter a valid age.");
        document.getElementById("accessMessage").textContent = "Invalid age. Please try again.";
    } else {
        let accessMessage;
        if (age >= 18) {
            accessMessage = "Access: Adult";
        } else {
            accessMessage = "Access: Minor";
        }
        document.getElementById("accessMessage").textContent = accessMessage;
    }
}
