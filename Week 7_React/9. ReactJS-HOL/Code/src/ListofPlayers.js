import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 85 },
    { name: 'Rohit', score: 40 },
    { name: 'Rahul', score: 75 },
    { name: 'Pant', score: 30 },
    { name: 'Jadeja', score: 90 },
    { name: 'Shami', score: 60 },
    { name: 'Bumrah', score: 70 },
    { name: 'Gill', score: 95 },
    { name: 'Surya', score: 25 },
    { name: 'Iyer', score: 55 },
    { name: 'Hardik', score: 80 }
  ];

  const filtered = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>List of Players</h2>
      <ul>
        {players.map((player, idx) => (
          <li key={idx}>{player.name} - {player.score}</li>
        ))}
      </ul>
      <hr/>
      <h3>List of Players having Scores less than 70</h3>
      <ul>
        {filtered.map((player, idx) => (
          <li key={idx}>{player.name}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
