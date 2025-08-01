import React, { useState } from 'react';

function EventDemo() {
  const [count, setCount] = useState(5);

  const increment = () => {
    setCount(prev => prev + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayHello = () => {
    alert("Hello! Value increased.");
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const handleSyntheticClick = (event) => {
    alert("I was clicked");
  };

  return (
    <div>
      <p>{count}</p>
      <button onClick={increment}>Increment</button><br /><br />
      <button onClick={decrement}>Decrement</button><br /><br />
      <button onClick={() => sayWelcome("welcome")}>Say welcome</button><br /><br />
      <button onClick={handleSyntheticClick}>Click on me</button>
    </div>
  );
}

export default EventDemo;
