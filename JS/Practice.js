async function fetchUserData() {
    console.log("Fetching user...");
    let user = await fetch("https://jsonplaceholder.typicode.com/users/1");
    let userData = await user.json();
  
    console.log("Fetching user’s posts...");
    let posts = await fetch(`https://jsonplaceholder.typicode.com/users/${userData.id}/posts`);
    let userPosts = await posts.json();
  
    console.log("User:", userData);
    console.log("Posts:", userPosts);
  }
//maintaining streak exams are going 
  
  fetchUserData();
  
