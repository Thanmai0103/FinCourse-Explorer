import React, { useState } from "react";
import axios from "axios";
import "./App.css";

function App() {

  const [keyword, setKeyword] = useState("");
  const [courses, setCourses] = useState([]);

  const searchCourses = async () => {

    try {

      const response = await axios.get(
        `http://localhost:8080/api/courses/search?keyword=${keyword}`
      );

      setCourses(response.data);

    } catch (error) {

      console.error(error);
    }
  };

  const getCourseLink = (courseName) => {

    switch (courseName) {

      case "React Fundamentals":
        return "https://react.dev/learn/describing-the-ui";

      case "Java Spring Boot Basics":
        return "https://spring.io/guides";

      case "Python for AI":
        return "https://www.python.org/about/gettingstarted/";

      case "DevOps with Docker":
        return "https://docs.docker.com/get-started/";

      case "Cloud Fundamentals":
        return "https://aws.amazon.com/getting-started/";

      case "Professional Communication":
        return "https://www.coursera.org/learn/wharton-communication-skills";

      case "AI Tools Foundation":
        return "https://openai.com/chatgpt";

      default:
        return "#";
    }
  };

  return (
    <div className="container">

      <h1>FinCourse Explorer</h1>

      <div className="search-box">

        <input
          type="text"
          placeholder="Search LMS courses..."
          value={keyword}
          onChange={(e) => setKeyword(e.target.value)}
        />

        <button onClick={searchCourses}>
          🔍 Explore Courses
        </button>

      </div>

      {courses.length > 0 ? (

        courses.map((course, index) => (

          <div className="card" key={index}>

            <h2>{course.courseName}</h2>

            <p><span className="label">Category:</span> {course.category}</p>
            <p><span className="label">Level:</span> {course.level}</p>
            <p><span className="label">Duration:</span> {course.duration}</p>
            <p><span className="label">Description:</span> {course.description}</p>
            <p><span className="label">Recommended For:</span> {course.recommendedFor}</p>

            <a
              href={getCourseLink(course.courseName)}
              target="_blank"
              rel="noreferrer"
            >
              Start Learning
            </a>

          </div>
        ))

      ) : (
        <p className="no-course">
           Find Your Courses Here
        </p>
      )}

    </div>
  );
}

export default App;