import logo from './logo.svg';
import React from 'react';
import './App.css';
import CourseDetails from './components/CourseDetails';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';

function App() {
  return (
    <div className="container">
      <CourseDetails />
      <div className="divider"></div>
      <BookDetails />
      <div className="divider"></div>
      <BlogDetails />
    </div>
  );
}

export default App;

