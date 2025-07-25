import logo from './logo.svg';
import React from 'react';
import './App.css';
import CalculateScore from './Components/CalculateScore'; // 👈 No curly braces!

function App() {
  return (
    <div>
      <CalculateScore
        Name="Steeve"
        School="DNV Public School"
        total={284}
        goal={300}
      />
    </div>
  );
}

export default App;




