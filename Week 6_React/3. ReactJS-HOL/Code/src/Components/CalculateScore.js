import React from 'react';
import '../Stylesheets/mystyle.css';

const percentToDecimal = (decimal) => {
  return decimal.toFixed(2) + '%';
};

const calcScore = (total, goal) => {
  return percentToDecimal((total / goal) * 100);
};

const CalculateScore = ({ Name, School, total, goal }) => {
  return (
    <div className="container formatstyle">
      <h1>Student Score Calculator</h1>

      <div className="Name">
        <span><strong>Name:</strong> {Name}</span>
      </div>

      <div className="School">
        <span><strong>School:</strong> {School}</span>
      </div>

      <div className="Total">
        <span><strong>Total:</strong> {total}</span>
      </div>

      <div className="Score">
        <span><strong>Score:</strong> {calcScore(total, goal)}</span>
      </div>

      {/* <div className="Average">
        <span><strong>Score:</strong> {calcScore(total, goal)}</span>
      </div> */}
    </div>
  );
};

export default CalculateScore;
