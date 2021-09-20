import React from "react";
import { useState } from "react";
//import "../css/main.css";

export function Tables() {
  let [num, setNum] = useState(0);

  const table = () => {
    for (let i = 0; i < 11; i++) {}
  };
  return (
    <div>
      <div className="container">
        <div className="inner-container">
          <h1>Math Table</h1>
        </div>
        <div className="inner-container">
          <form>
            <div className="inner-container">
              <label for="num1">Enter Number</label>
              <input
                type="text"
                id="num"
                name="num"
                onChange={(e) => {
                  setNum(e.target.value);
                }}
              />
            </div>

            <div className="inner-container">
              <label for="num3">Result: </label>
              <input type="text" id="num1" name="num1" value={num1} />
            </div>
            <div className="inner-container">
              <input
                type="button"
                className="button"
                value="Display Table"
                onClick={calculate}
              />
            </div>

            <div></div>
          </form>
        </div>
      </div>
    </div>
  );
}
