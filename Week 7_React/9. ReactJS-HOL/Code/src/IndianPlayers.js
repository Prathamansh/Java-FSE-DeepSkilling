import React from 'react';

const IndianPlayers = () => {
  const T20players = ['Virat', 'Rohit', 'Surya', 'Pant'];
  const RanjiPlayers = ['Jaiswal', 'Rinku', 'Tripathi'];

  // Merging using ES6 spread
  const allPlayers = [...T20players, ...RanjiPlayers];

  // Odd and Even using destructuring
  const oddPlayers = allPlayers.filter((_, idx) => idx % 2 === 0);
  const evenPlayers = allPlayers.filter((_, idx) => idx % 2 !== 0);

  return (
    <div>
      <h3>Odd Players</h3>
      <ul>{oddPlayers.map((p, idx) => <li key={idx}>{p}</li>)}</ul>
      <hr/>
      <h3>Even Players</h3>
      <ul>{evenPlayers.map((p, idx) => <li key={idx}>{p}</li>)}</ul>
      <hr/>
      <h2>List of Indian Players Merged: </h2>
      <ul>{allPlayers.map((p, idx) => <li key={idx}>{p}</li>)}</ul>

      
    </div>
  );
};

export default IndianPlayers;
