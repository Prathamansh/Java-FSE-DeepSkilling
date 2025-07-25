import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false,
    };
  }

  componentDidMount() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((response) => response.json())
      .then((data) => {
        console.log("Fetched posts:", data); // 🔍 Check browser console
        this.setState({ posts: data });
      })
      .catch((error) => {
        console.error("Fetch error:", error);
        this.setState({ hasError: true });
      });
  }

  componentDidCatch(error, info) {
    alert("Error in Posts component: " + error.toString());
    this.setState({ hasError: true });
  }

  render() {
    if (this.state.hasError) {
      return <h2>Error loading posts.</h2>;
    }

    if (this.state.posts.length === 0) {
      return <h2>Loading posts...</h2>; // ✅ Visible while loading
    }

    return (
      <div>
        <h2>Blog Posts</h2>
        {this.state.posts.map((post) => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
