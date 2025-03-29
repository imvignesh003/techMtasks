class Book {
    constructor(title, author, isAvailable = true) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
}

function checkoutBook(bookObj) {
    if (bookObj.isAvailable) {
        bookObj.isAvailable = false;
        return `You have checked out ${bookObj.title}.`;
    }
    return `Sorry, ${bookObj.title} is not available.`;
}

const book1 = new Book("Atomic Habits", "James clear");
const book2 = new Book("Zero to One", "Peter Thiel", false);
console.log(checkoutBook(book1)); 
console.log(checkoutBook(book2)); 