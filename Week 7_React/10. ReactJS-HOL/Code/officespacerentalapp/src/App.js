import logo from './logo.svg';
import './App.css';
import React from 'react';

function App() {
  const office = {
    name: "DBS",
    rent: 50000,
    address: "Chennai"
  };

  const rentStyle = {
    color: office.rent < 60000 ? 'red' : 'green',
    fontWeight: 'bold'
  };

  return (
    <div className="App">
      <h1>Office Space , at Affordable Range</h1>

      <img 
        src="/image.png" 
        alt="Office space" 
        style={{ width: '300px', height: '200px', marginBottom: '20px' }} 
      />

      <p id='one'><strong>Name: {office.name}</strong></p>
      <p><strong style={rentStyle}>Rent: Rs. {office.rent}</strong></p>
      <p><strong>Address: {office.address}</strong></p>
    </div>
  );
}

export default App;
