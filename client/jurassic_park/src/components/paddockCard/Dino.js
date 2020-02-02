import React from 'react';

const Dino = ({dino, onHandleSelectDino}) => {

  const handleSelect = (e) => {
    e.stopPropagation();
    onHandleSelectDino(dino);
  }

  return (
    <div className="dino" onClick={handleSelect}>
      <p>Food Level:{dino.foodLevel}</p>
      <p>Dietary Type: {dino.dietaryType}</p>
      <p>Revenue: {dino.revenue}</p>
    </div>
  )
  
}

export default Dino;