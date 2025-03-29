const tasks = [
    { name: "Submit report", isCompleted: true, dueDate: "2025-03-20" },
    { name: "Review PR", isCompleted: false, dueDate: "2025-04-01" },
    { name: "Plan sprint", isCompleted: false, dueDate: "2025-03-29" }
];

function getIncompleteTasks(tasks) {
    return tasks.filter(task => !task.isCompleted);
}

const formattedTasks = tasks.map(task => {
    return task.dueDate < "2025-03-29" ? `[Overdue] ${task.name}` : task.name;
});

const totalTasks = () => tasks.length;

console.log("Incomplete Tasks:", getIncompleteTasks(tasks));
console.log("Formatted Tasks:", formattedTasks);
console.log("Total Task Count:", totalTasks());