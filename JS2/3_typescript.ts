interface User {
    username: string;
    age: number;
    email: string;
}

function createUser(username: string, age: number, email: string): User {
    return { username, age, email };
}
export { createUser };