import React from "react";
import { useState } from "react";
import "../css/main.css";

export function SubtractTwoNumbers() {
  let [num1, setNum1] = useState(0);
  let [num2, setNum2] = useState(0);
  let [num3, setNum3] = useState(0);

  let calculate = () => {
    setNum3(num1 - num2);
  };
  return (
    <div>
      <div className="container">
        <div className="inner-container">
          <h1>Subtraction of 2 numbers</h1>
        </div>
        <div className="inner-container">
          <form>
            <div className="inner-container">
              <label for="num1">Enter Number 1: </label>
              <input
                type="text"
                id="num1"
                name="num1"
                onChange={(e) => {
                  setNum1(e.target.value);
                }}
              />
            </div>
            <div className="inner-container">
              <label for="num1">Enter Number 2: </label>
              <input
                type="text"
                id="num2"
                name="num2"
                onChange={(e) => {
                  setNum2(e.target.value);
                }}
              />
            </div>
            <div className="inner-container">
              <label for="num3">Result: </label>
              <input type="text" id="num3" name="num3" value={num3} />
            </div>
            <div className="inner-container">
              <input
                type="button"
                className="button"
                value="Calculate"
                onClick={calculate}
              />
            </div>
          </form>
        </div>
      </div>
    </div>
  );
}
