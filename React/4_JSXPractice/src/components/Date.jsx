export function CurrentDate() {
    return <p>Today's Date: {new Date().toLocaleDateString()}</p>;
}