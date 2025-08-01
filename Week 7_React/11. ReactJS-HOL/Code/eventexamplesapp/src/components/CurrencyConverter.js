import React, { useState } from 'react';

function CurrencyConverter() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const euro = parseFloat(amount) / 90;
    setCurrency(`€ ${euro.toFixed(2)}`);
  };

  return (
    <div style={{ marginTop: "30px" }}>
      <h2 style={{ color: "green" }}>Currency Convertor!!!</h2>
      <form onSubmit={handleSubmit}>
        <label>Amount:</label><br />
        <input 
          type="number" 
          value={amount} 
          onChange={(e) => setAmount(e.target.value)} 
        /><br /><br />
        <label>Currency:</label><br />
        <input 
          type="text" 
          value={currency} 
          readOnly 
        /><br /><br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConverter;
