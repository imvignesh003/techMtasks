async function loadUsersAndPosts() {
    try {
        const usersResponse = await fetch("https://localhost:5500/users");
        const users = await usersResponse.json();
       
        const userPosts = await Promise.all(
            users.map(async user => {
                const postsResponse = await fetch(`https://localhost:5500/posts?userId=${user.id}`);
                const posts = await postsResponse.json();
                return { ...user, posts };
            })
        );
       
        console.log(userPosts);
    } catch (error) {
        console.error("Error loading data:", error);
    }
}

loadUsersAndPosts();