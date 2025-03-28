function processMessage() {
    let message = document.getElementById("userMessage").value;

    message = message.trim();
    if (message.length === 0) {
        alert("Please enter a message.");
        document.getElementById("transformedMessage").textContent = "";
    } else {
        if (message.length < 10) {
            message = message.toUpperCase();
        } else {
            message = message.toLowerCase();
        }

        document.getElementById("transformedMessage").textContent = "Transformed Message: " + message;
    }
}
