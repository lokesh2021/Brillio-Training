import React from "react";
import { useState } from "react";
//import "../css/main.css";

export const Multiplicationtables = () => {
  let [mynum, setMyNum] = useState(0);

  let calculate = () => {
    let htmlStr = "";

    for (let i = 1; i < 11; i++) {
      let eqStr = `${mynum} x ${i} = ${parseInt(mynum) * i}`;
      htmlStr += eqStr + "<br/>";
    }

    document.getElementById("res").innerHTML = htmlStr;
  };

  return (
    <div>
      <div>
        <form>
          <label for="mynum">Enter Number:: </label>
          <input
            type="text"
            id="mynum"
            name="mynum"
            onChange={(e) => {
              setMyNum(e.target.value);
            }}
          />
          <br />
          <input type="button" value="Generate" onClick={calculate} />
          <br />
          <div type="text" id="res"></div>
        </form>
      </div>
    </div>
  );
};
